package com.t3h.chat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.t3h.chat.api.ApiBuilder;
import com.t3h.chat.utils.DialogUtils;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener, Callback<ResponseBody> {

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
        String userName = edtUserName.getText().toString();
        String password = edtPassword.getText().toString();
        String name = edtName.getText().toString();
        if (userName.isEmpty()
        || password.isEmpty()
        || name.isEmpty()) {
            Toast.makeText(this, "Data empty",
                    Toast.LENGTH_SHORT).show();
            return;
        }
        DialogUtils.showProgress(this);
        ApiBuilder.getInstance()
                .register(userName, password, name)
                .enqueue(this);
    }

    @Override
    public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
        DialogUtils.dismissProgress();
        if (response.code() == 200) {
            finish();
        }else {
            Toast.makeText(this, "Register fail", Toast.LENGTH_SHORT)
                    .show();
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        DialogUtils.dismissProgress();
        Toast.makeText(this, "Register fail", Toast.LENGTH_SHORT)
                .show();
    }
}
