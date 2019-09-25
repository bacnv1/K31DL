package com.t3h.qlnhanvien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.t3h.qlnhanvien.dao.AppDatabase;
import com.t3h.qlnhanvien.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Employee> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = AppDatabase.getInstance(this).getEmployeeDao().getAll();

    }
}
