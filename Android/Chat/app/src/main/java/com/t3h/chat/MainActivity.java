package com.t3h.chat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView lvChat;
    private EditText edtMessage;
    private ImageView imSent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        lvChat = findViewById(R.id.lv_chat);
        edtMessage = findViewById(R.id.edt_message);
        imSent = findViewById(R.id.im_sent);
        imSent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
