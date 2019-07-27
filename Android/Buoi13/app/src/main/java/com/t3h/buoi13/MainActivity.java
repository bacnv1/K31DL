package com.t3h.buoi13;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.t3h.buoi13.adapter.NewsPagerAdapter;
import com.t3h.buoi13.fragment.FavoriteFragment;
import com.t3h.buoi13.fragment.NewsFragment;
import com.t3h.buoi13.fragment.SavedFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    // setup pager
    private ViewPager pager;
    private NewsPagerAdapter adapter;
    private NewsFragment fmNews = new NewsFragment();
    private SavedFragment fmSaved = new SavedFragment();
    private FavoriteFragment fmFavorite = new FavoriteFragment();
    private TabLayout tab;

    private Button btnNews;
    private Button btnSave;
    private Button btnFavorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        drawer = findViewById(R.id.drawer_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle = new ActionBarDrawerToggle(
                this,
                drawer,
                R.string.app_name,
                R.string.app_name);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        adapter = new NewsPagerAdapter(getSupportFragmentManager());
        pager = findViewById(R.id.view_pager);
        pager.setAdapter(adapter);
        Fragment[] data = {
                fmNews,
                fmFavorite,
                fmSaved
        };
        adapter.setData(data);

        tab = findViewById(R.id.tab_layout);
        tab.setupWithViewPager(pager);

        btnFavorite = findViewById(R.id.tab_favorite);
        btnNews = findViewById(R.id.tab_news);
        btnSave = findViewById(R.id.tab_saved);

        btnSave.setOnClickListener(this);
        btnNews.setOnClickListener(this);
        btnFavorite.setOnClickListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab_favorite:
                pager.setCurrentItem(2);
                break;
            case R.id.tab_saved:
                pager.setCurrentItem(1);
                break;
            case R.id.tab_news:
                pager.setCurrentItem(0);
                break;
        }
        drawer.closeDrawers();
    }
}
