package com.t3h.chat.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {
    @SerializedName("user_name")
    private String userName;
    @SerializedName("password")
    private String password;
    @SerializedName("name")
    private String name;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
