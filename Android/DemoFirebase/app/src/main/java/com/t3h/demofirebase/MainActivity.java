package com.t3h.demofirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnSuccessListener<Void>, OnFailureListener, ValueEventListener {

    private RecyclerView lvChat;
    private ChatApdater adapter;
    private EditText edtMessage;
    private ImageView imSend;

    private final SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy HH:mm");

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference reference = database.getReference("Chat");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        reference.addValueEventListener(this);
    }

    private void initViews() {
        lvChat = findViewById(R.id.lv_message);
        adapter = new ChatApdater(this);
        lvChat.setAdapter(adapter);

        edtMessage = findViewById(R.id.edt_message);
        imSend = findViewById(R.id.im_send);
        imSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = edtMessage.getText().toString();
        if (message.isEmpty()) {
            return;
        }
        Chat chat = new Chat();
        chat.setDate(format.format(new Date()));
        chat.setMessage(message);
        chat.setName("BacNV");
        reference.child(chat.getId()+"").setValue(chat)
        .addOnSuccessListener(this)
        .addOnFailureListener(this);
    }

    @Override
    public void onSuccess(Void aVoid) {
        edtMessage.setText("");
    }

    @Override
    public void onFailure(@NonNull Exception e) {
        Toast.makeText(this, "Send message fail", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
        final ArrayList<Chat> arr = new ArrayList<>();
        for (DataSnapshot snapshot: dataSnapshot.getChildren()) {
            Chat chat = snapshot.getValue(Chat.class);
            arr.add(chat);
        }
        adapter.setData(arr);
        lvChat.post(new Runnable() {
            @Override
            public void run() {
                lvChat.scrollToPosition(arr.size() - 1);
            }
        });
    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
}
