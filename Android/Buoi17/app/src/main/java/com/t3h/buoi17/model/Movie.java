package com.t3h.buoi17.model;

import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("title")
    private String title;
    @SerializedName("image")
    private String image;
    @SerializedName("rating")
    private float rating;
    @SerializedName("releaseYear")
    private String year;
    @SerializedName("genre")
    private String[] genre;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public float getRating() {
        return rating;
    }

    public String getYear() {
        return year;
    }

    public String[] getGenre() {
        return genre;
    }
}
