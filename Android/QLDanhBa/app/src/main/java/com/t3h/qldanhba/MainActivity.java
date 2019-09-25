package com.t3h.qldanhba;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.t3h.qldanhba.adapter.ContactAdapter;
import com.t3h.qldanhba.data.SystemData;
import com.t3h.qldanhba.models.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ContactAdapter.ItemContactListener {

    private static final int REQUEST_EDIT = 1;
    private ArrayList<Contact> data;
    private RecyclerView lvContact;
    private ContactAdapter adapter;
    private SystemData systemData;

    private String[] PERMISSIONS = {
            Manifest.permission.READ_CONTACTS,
            Manifest.permission.WRITE_CONTACTS,
            Manifest.permission.READ_EXTERNAL_STORAGE
    };

    private boolean checkPermissions() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            for (String p : PERMISSIONS) {
                if (checkSelfPermission(p) != PackageManager.PERMISSION_GRANTED) {
                    requestPermissions(PERMISSIONS, 0);
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (checkPermissions()) {
            initViews();
        }else{
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (checkPermissions()) {
            initViews();
        }
    }

    private void initViews() {
        systemData = new SystemData(this);
        data = systemData.getContact();
        adapter = new ContactAdapter(this);
        lvContact = findViewById(R.id.lv_contact);
        lvContact.setAdapter(adapter);
        adapter.setData(data);
        adapter.setListener(this);
    }

    @Override
    public void onEdit(Contact item) {
        Intent intent = new Intent(this, EditActivity.class);
        intent.putExtra(Contact.class.getName(), item);
        startActivityForResult(intent, REQUEST_EDIT);
    }

    @Override
    public void onCall(Contact item) {

    }

    @Override
    public void onMessage(Contact item) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_EDIT && resultCode == RESULT_OK) {
            this.data = systemData.getContact();
            adapter.setData(this.data);
        }
    }
}
