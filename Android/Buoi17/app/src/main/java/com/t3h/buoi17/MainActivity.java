package com.t3h.buoi17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.t3h.buoi17.adapter.MovieAdapter;
import com.t3h.buoi17.api.ApiBuilder;
import com.t3h.buoi17.model.Movie;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener, Callback<ArrayList<Movie>> {
    private SearchView searchView;
    private RecyclerView lvMovie;
    private MovieAdapter adapter;
    private ArrayList<Movie> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ApiBuilder.getInstance().getMovies().enqueue(this);
        lvMovie = findViewById(R.id.lv_movies);
        adapter = new MovieAdapter(this);
        lvMovie.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search,menu);
        searchView = (SearchView) menu.findItem(R.id.search_actionbar).getActionView();
        searchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.getFilter().filter(newText);
        return false;
    }

    @Override
    public void onResponse(Call<ArrayList<Movie>> call, Response<ArrayList<Movie>> response) {
        data = response.body();
        adapter.setData(data);
    }

    @Override
    public void onFailure(Call<ArrayList<Movie>> call, Throwable t) {

    }
}
