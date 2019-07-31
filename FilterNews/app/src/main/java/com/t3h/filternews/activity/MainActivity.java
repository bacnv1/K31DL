package com.t3h.filternews.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.tabs.TabLayout;
import com.t3h.filternews.R;
import com.t3h.filternews.adapter.NewsPagerAdapter;
import com.t3h.filternews.api.ApiBuilder;
import com.t3h.filternews.fragment.FavoriteFragment;
import com.t3h.filternews.fragment.NewsFragment;
import com.t3h.filternews.fragment.SavedFragment;
import com.t3h.filternews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener, Callback<NewsResponse> {

    private NewsFragment fmNews = new NewsFragment();
    private SavedFragment fmSaved = new SavedFragment();
    private FavoriteFragment fmFavorite = new FavoriteFragment();

    private ViewPager pager;
    private TabLayout tab;
    private NewsPagerAdapter adapter;

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        pager = findViewById(R.id.pager);
        tab = findViewById(R.id.tab);
        Fragment[] fms = {
                fmNews,
                fmSaved,
                fmFavorite
        };
        adapter = new NewsPagerAdapter(getSupportFragmentManager(), fms);
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);

        dialog = new Dialog(this,
                android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth);
        dialog.setContentView(R.layout.dialog_progress);
        dialog.setCancelable(false);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu, menu);
        SearchView search = (SearchView) menu.findItem(R.id.menu_search)
                .getActionView();
        search.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        if (query.isEmpty()) {
            return false;
        }
        dialog.show();
        ApiBuilder.getInstance().getNews(
                query,
                "f70e06a71e524dfa86dbfcf7ca38e62f",
                "vi"
        ).enqueue(this);
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return true;
    }

    @Override
    public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
        fmNews.setData(response.body().getData());
        dialog.dismiss();
    }

    @Override
    public void onFailure(Call<NewsResponse> call, Throwable t) {
        dialog.dismiss();
    }

    public NewsFragment getFmNews() {
        return fmNews;
    }

    public SavedFragment getFmSaved() {
        return fmSaved;
    }

    public FavoriteFragment getFmFavorite() {
        return fmFavorite;
    }
}
