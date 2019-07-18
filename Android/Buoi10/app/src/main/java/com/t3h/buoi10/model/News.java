package com.t3h.buoi10.model;

import com.google.gson.annotations.SerializedName;

public class News {
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String desc;
    @SerializedName("url")
    private String url;
    @SerializedName("urlToImage")
    private String image;
    @SerializedName("publishedAt")
    private String date;
    @SerializedName("content")
    private String content;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
