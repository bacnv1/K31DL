package com.t3h.buoi7;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_PICK_IMAGE = 1;
    private TextView tvInfo;
    private EditText edtValue;
    private Button btnCall;
    private Button btnBrowser;
    private Button btnGallery;
    private ImageView imGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        tvInfo = findViewById(R.id.tv_info);
        edtValue = findViewById(R.id.edt_value);
        btnBrowser = findViewById(R.id.btn_browser);
        btnCall = findViewById(R.id.btn_call);
        btnGallery = findViewById(R.id.btn_gallery);
        imGallery = findViewById(R.id.im_gallery);
        btnGallery.setOnClickListener(this);
        btnCall.setOnClickListener(this);
        btnBrowser.setOnClickListener(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(Const.EXTRA_USER_NAME);
        String password = intent.getStringExtra(Const.EXTRA_PASSWORD);
        tvInfo.setText(userName + " - " + password);
    }

    @Override
    public void onClick(View v) {
        String value = edtValue.getText().toString();

        switch (v.getId()) {
            case R.id.btn_browser:
                Intent browser = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse(value);
                browser.setData(uri);
                startActivity(browser);
                break;
            case R.id.btn_call:
                Intent call = new Intent(Intent.ACTION_CALL);
                value = "tel:" + value;
                call.setData(Uri.parse(value));
                startActivity(call);
                break;
            case R.id.btn_gallery:
                Intent gallery = new Intent(Intent.ACTION_GET_CONTENT);
                gallery.setType("image/*");
                gallery = Intent.createChooser(gallery, "Pick image");
                startActivityForResult(gallery, REQUEST_PICK_IMAGE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_PICK_IMAGE){
            if (resultCode == RESULT_OK){
                try {
                    Bitmap b = MediaStore.Images.Media
                            .getBitmap(getContentResolver(), data.getData());
                    imGallery.setImageBitmap(b);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
