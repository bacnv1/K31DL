package com.t3h.chat.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Chat implements Serializable {
    @SerializedName("id")
    private long id;
    @SerializedName("user_name")
    private String userName;
    @SerializedName("name")
    private String name;
    @SerializedName("message")
    private String message;
    @SerializedName("pub_date")
    private String date;

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
