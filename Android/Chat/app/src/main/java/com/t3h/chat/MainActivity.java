package com.t3h.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.t3h.chat.adapter.ChatAdapter;
import com.t3h.chat.api.ApiBuilder;
import com.t3h.chat.models.Chat;
import com.t3h.chat.models.User;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Callback<ResponseBody>, Runnable {
    private RecyclerView lvChat;
    private EditText edtMessage;
    private ImageView imSent;
    private ChatAdapter adapter;
    private ArrayList<Chat> data;

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (User) getIntent().getSerializableExtra(User.class.getName());
        initViews();
        Thread t = new Thread(this);
        t.start();
    }

    private void loadData() {
        ApiBuilder.getInstance().getChats()
                .enqueue(new Callback<ArrayList<Chat>>() {
                    @Override
                    public void onResponse(Call<ArrayList<Chat>> call, final Response<ArrayList<Chat>> response) {
                        adapter.setData(response.body());
                        lvChat.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                lvChat.scrollToPosition(response.body().size() - 1);
                            }
                        }, 500);
                    }

                    @Override
                    public void onFailure(Call<ArrayList<Chat>> call, Throwable t) {

                    }
                });
    }

    private void initViews() {
        lvChat = findViewById(R.id.lv_chat);
        adapter = new ChatAdapter(this, user.getUserName());
        lvChat.setAdapter(adapter);

        edtMessage = findViewById(R.id.edt_message);
        imSent = findViewById(R.id.im_sent);
        imSent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = edtMessage.getText().toString();
        if (message.isEmpty()) {
            return;
        }
        ApiBuilder.getInstance().chat(user.getUserName(), message)
                .enqueue(this);
    }

    @Override
    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
        if (response.code() == 200) {
            edtMessage.setText("");
        } else {
            Toast.makeText(this, "Sent message fail",
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        Toast.makeText(this, "Sent message fail",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void run() {
        while (true) {
            loadData();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
