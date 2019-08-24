package com.t3h.chat.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class ShareUtils {
    private SharedPreferences share;

    public ShareUtils(Context context) {
        this.share = context.getSharedPreferences(
                "ShareUtils",
                Context.MODE_PRIVATE
        );
    }

    public void put(String key, String password) {
        share.edit().putString(key, password).commit();
    }

    public String get(String key) {
        return share.getString(key, "");
    }
}
