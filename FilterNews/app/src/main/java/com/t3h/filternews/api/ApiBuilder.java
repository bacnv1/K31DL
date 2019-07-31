package com.t3h.filternews.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class ApiBuilder {
    private static Api api;

    public static Api getInstance() {
        if (api == null) {
            api = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://newsapi.org/v2/")
                    .build()
                    .create(Api.class);
        }
        return api;
    }
}
