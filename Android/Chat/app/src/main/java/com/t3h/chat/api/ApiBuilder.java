package com.t3h.chat.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiBuilder {
    private static Api api;

    public static Api getInstance() {
        if (api == null) {
            api = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://192.168.1.102/chatk31/")
                    .build()
                    .create(Api.class);
        }
        return api;
    }
}
