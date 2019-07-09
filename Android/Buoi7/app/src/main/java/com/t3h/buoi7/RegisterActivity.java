package com.t3h.buoi7;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtUserName;
    private EditText edtPassword;
    private Button btnOk;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initViews();
    }

    private void initViews() {
        edtPassword = this.findViewById(R.id.edt_password);
        edtUserName = findViewById(R.id.edt_user_name);
        btnOk = findViewById(R.id.btn_ok);
        btnOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String userName = edtUserName.getText().toString();
        String password = edtPassword.getText().toString();

        if (userName.isEmpty() || password.isEmpty()){
            Toast.makeText(this, R.string.data_invalid, Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent();
        intent.putExtra(Const.EXTRA_USER_NAME, userName);
        intent.putExtra(Const.EXTRA_PASSWORD, password);
        setResult(RESULT_OK, intent);
        finish();
    }
}
