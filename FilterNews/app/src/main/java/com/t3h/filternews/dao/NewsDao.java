package com.t3h.filternews.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.t3h.filternews.model.News;

import java.util.List;

@Dao
public interface NewsDao {

    @Query("SELECT * FROM News")
    List<News> getSaved();

    @Query("SELECT * FROM News WHERE isFavorite = :isFavorite")
    List<News> getFavorite(boolean isFavorite);

    @Insert
    void insert(News news);

    @Update
    void update(News news);

    @Delete
    void delete(News news);
}
