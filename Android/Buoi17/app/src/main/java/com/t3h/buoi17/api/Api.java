package com.t3h.buoi17.api;

import com.t3h.buoi17.model.Movie;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("movies.json")
    Call<ArrayList<Movie>> getMovies();
}
