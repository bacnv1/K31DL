package com.t3h.filternews.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class News {
    @NonNull
    @PrimaryKey
    @SerializedName("title")
    private String title;
    @ColumnInfo
    @SerializedName("urlToImage")
    private String image;
    @ColumnInfo
    @SerializedName("description")
    private String desc;
    @ColumnInfo
    @SerializedName("publishedAt")
    private String date;
    @ColumnInfo
    @SerializedName("url")
    private String url;

    @ColumnInfo
    private boolean isFavorite;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getDesc() {
        return desc;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }
}
