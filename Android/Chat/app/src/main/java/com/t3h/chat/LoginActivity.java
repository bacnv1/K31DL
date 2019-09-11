package com.t3h.chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.t3h.chat.api.Api;
import com.t3h.chat.api.ApiBuilder;
import com.t3h.chat.models.User;
import com.t3h.chat.utils.DialogUtils;
import com.t3h.chat.utils.ShareUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.PUT;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, Callback<User> {

    private final String KEY_USER_NAME = "KEY_USER_NAME";
    private final String KEY_PASSWORD = "KEY_PASSWORD";
    private ShareUtils shareUtils;

    private EditText edtUserName;
    private EditText edtPassword;
    private Button btnLogin;
    private Button btnRegister;
    private String userName;
    private String password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        shareUtils = new ShareUtils(this);
        userName = shareUtils.get(KEY_USER_NAME);
        password = shareUtils.get(KEY_PASSWORD);
        if (userName.isEmpty() == false && password.isEmpty() == false){
            login();
        }
    }

    private void initViews() {
        edtUserName = findViewById(R.id.edt_user_name);
        edtPassword = findViewById(R.id.edt_password);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                userName = edtUserName.getText().toString();
                password = edtPassword.getText().toString();
                if (userName.isEmpty() || password.isEmpty()) {
                    Toast.makeText(this, "Data empty", Toast.LENGTH_SHORT)
                            .show();
                    return;
                }
                login();
                break;
            case R.id.btn_register:
                Intent intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void login() {
        DialogUtils.showProgress(this);
        ApiBuilder.getInstance().login(userName, password).enqueue(this);
    }

    @Override
    public void onResponse(Call<User> call, Response<User> response) {
        DialogUtils.dismissProgress();
        if (response.code() == 200) {
            shareUtils.put(KEY_PASSWORD, password);
            shareUtils.put(KEY_USER_NAME, userName);

            User user = response.body();
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra(User.class.getName(), user);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this, "Login fail", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    @Override
    public void onFailure(Call<User> call, Throwable t) {
        DialogUtils.dismissProgress();
        Toast.makeText(this, "Login fail", Toast.LENGTH_SHORT)
                .show();
    }
}
