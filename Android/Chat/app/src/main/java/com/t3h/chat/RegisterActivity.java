package com.t3h.chat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtUserName;
    private EditText edtPassword;
    private EditText edtName;
    private Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
    }

    private void initViews() {
        edtUserName = findViewById(R.id.edt_user_name);
        edtPassword = findViewById(R.id.edt_password);
        edtName = findViewById(R.id.edt_name);
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
