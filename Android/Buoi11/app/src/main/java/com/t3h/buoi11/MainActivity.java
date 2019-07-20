package com.t3h.buoi11;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.t3h.buoi11.adapter.StudentAdapter;
import com.t3h.buoi11.dao.AppDatabase;
import com.t3h.buoi11.model.Student;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, StudentAdapter.ItemStudentListener {

    private static final int REQUEST_STUDENT = 1;
    private RecyclerView lvStudent;
    private FloatingActionButton btnAdd;
    private StudentAdapter adapter;
    private List<Student> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        loadData();
    }

    private void loadData() {
        data = AppDatabase.getInstance(this)
                .getStudentDao()
                .getStudent();
        adapter.setData(data);
    }

    private void initViews() {
        lvStudent = findViewById(R.id.lv_student);
        btnAdd = findViewById(R.id.btn_add);
        adapter = new StudentAdapter(this);
        lvStudent.setAdapter(adapter);
        btnAdd.setOnClickListener(this);
        adapter.setListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = StudentActivity.newInstance(this, null);
        startActivityForResult(intent, REQUEST_STUDENT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_STUDENT
                && resultCode == RESULT_OK) {
            loadData();
        }
    }

    @Override
    public void onItemStudentClicked(int position) {
        Intent intent = StudentActivity
                .newInstance(this, data.get(position));
        startActivityForResult(intent, REQUEST_STUDENT);
    }

    @Override
    public void onItemStudentLongClicked(int position) {

    }
}
