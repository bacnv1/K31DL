package com.t3h.qldanhba;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.t3h.qldanhba.data.SystemData;
import com.t3h.qldanhba.models.Contact;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int REQUEST_IMAGE = 1;
    private ImageView imAvatar;
    private EditText edtName;
    private EditText edtPhone;
    private EditText edtLastName;
    private Button btnSave;

    private Contact contact;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        initViews();
    }

    private void initViews() {
        contact = (Contact) getIntent().getSerializableExtra(Contact.class.getName());

        edtLastName = findViewById(R.id.edt_last_name);
        edtName = findViewById(R.id.edt_first_name);
        edtPhone = findViewById(R.id.edt_phone);
        imAvatar = findViewById(R.id.im_avatar);
        btnSave = findViewById(R.id.btn_save);

        edtPhone.setText(contact.getPhone());
        edtName.setText(contact.getName());
        Glide.with(imAvatar).load(contact.getAvatar()).error(R.drawable.user).into(imAvatar);

        imAvatar.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_avatar:
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                intent = Intent.createChooser(intent, "Pick image");
                startActivityForResult(intent, REQUEST_IMAGE);
                break;
            case R.id.btn_save:
                contact.setPhone(edtPhone.getText().toString());
                contact.setName(edtName.getText().toString());
                SystemData systemData = new SystemData(this);
//                int result = systemData.updateContact(contact);
//                if (result > 0) {
//                    setResult(RESULT_OK);
//                    finish();
//                }else {
//                    Toast.makeText(this, "Update fail", Toast.LENGTH_LONG).show();
//                }
                systemData.update(contact);
                setResult(RESULT_OK);
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE && resultCode == RESULT_OK) {
            contact.setAvatar(data.getData().toString());
            Glide.with(imAvatar).load(contact.getAvatar()).into(imAvatar);
        }
    }
}
