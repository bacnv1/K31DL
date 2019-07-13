package com.t3h.buoi9.models;

import androidx.annotation.DrawableRes;

public class Face {
    private int img;
    private String name;

    public Face(@DrawableRes int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
