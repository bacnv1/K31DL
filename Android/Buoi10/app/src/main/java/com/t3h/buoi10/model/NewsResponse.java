package com.t3h.buoi10.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NewsResponse {
    @SerializedName("articles")
    private ArrayList<News> data;

    public ArrayList<News> getData() {
        return data;
    }

    public void setData(ArrayList<News> data) {
        this.data = data;
    }
}
