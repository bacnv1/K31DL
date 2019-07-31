package com.t3h.filternews.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class NewsResponse {
    @SerializedName("articles")
    private ArrayList<News> data;

    public ArrayList<News> getData() {
        return data;
    }
}
