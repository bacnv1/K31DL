package com.t3h.qlnhanvien.dao;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.t3h.qlnhanvien.models.Employee;

@Database(entities = {Employee.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    "EmployeeDB.sqlite"
            )
                    .createFromAsset("EmployeeDB.sqlite")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract EmployeeDao getEmployeeDao();
}
