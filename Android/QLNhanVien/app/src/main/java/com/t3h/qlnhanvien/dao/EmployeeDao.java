package com.t3h.qlnhanvien.dao;

import androidx.room.Dao;
import androidx.room.Query;

import com.t3h.qlnhanvien.models.Employee;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Query("SELECT * FROM Employee")
    List<Employee> getAll();
}
