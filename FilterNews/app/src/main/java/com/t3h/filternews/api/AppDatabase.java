package com.t3h.filternews.api;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.t3h.filternews.dao.NewsDao;
import com.t3h.filternews.model.News;

@Database(entities = {News.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase database;

    public static AppDatabase getInstance(Context context) {
        if (database == null) {
            database = Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    "news-db"
                    )
                    .allowMainThreadQueries()
                    .build();
        }
        return database;
    }

    public abstract NewsDao getNewsDao();
}
