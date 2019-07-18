package com.t3h.buoi10.api;

import com.t3h.buoi10.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("everything")
    Call<NewsResponse> getNews(@Query("q") String keySearch,
                               @Query("apiKey") String apiKey,
                               @Query("language") String lan);
}
