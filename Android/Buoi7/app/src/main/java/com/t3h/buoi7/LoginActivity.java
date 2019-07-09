package com.t3h.buoi7;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int REQUEST_REGISTER = 1;

    private EditText edtUserName;
    private EditText edtPassword;
    private Button btnOk;
    private Button btnRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
    }

    private void initViews() {
        edtPassword = findViewById(R.id.edt_password);
        edtUserName = findViewById(R.id.edt_user_name);
        btnOk = findViewById(R.id.btn_ok);
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ok:
                String userName = edtUserName.getText().toString();
                String password = edtPassword.getText().toString();
                if (userName.isEmpty() || password.isEmpty()){
                    Toast.makeText(this, R.string.data_invalid, Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent main = new Intent(this, MainActivity.class);
                main.putExtra(Const.EXTRA_USER_NAME, userName);
                main.putExtra(Const.EXTRA_PASSWORD, password);
                startActivity(main);
                finish();
                break;
            case R.id.btn_register:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivityForResult(intent, REQUEST_REGISTER);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_REGISTER){
            if (resultCode == RESULT_OK){
                String userName = data.getStringExtra(Const.EXTRA_USER_NAME);
                String password = data.getStringExtra(Const.EXTRA_PASSWORD);
                edtUserName.setText(userName);
                edtPassword.setText(password);
            }else{
                Toast.makeText(this, R.string.register_cancelled, Toast.LENGTH_LONG).show();
            }
        }
    }
}
