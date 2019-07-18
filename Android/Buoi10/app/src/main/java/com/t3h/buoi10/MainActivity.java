package com.t3h.buoi10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.t3h.buoi10.adapter.NewsAdapter;
import com.t3h.buoi10.api.Api;
import com.t3h.buoi10.api.ApiBuilder;
import com.t3h.buoi10.model.NewsResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Callback<NewsResponse> {

    private Button btnSearch;
    private EditText edtSearch;
    private RecyclerView lvNews;
    private NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        edtSearch = findViewById(R.id.edt_search);
        btnSearch = findViewById(R.id.btn_search);
        lvNews = findViewById(R.id.lv_news);
        btnSearch.setOnClickListener(this);

        adapter = new NewsAdapter(this);
        lvNews.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        String keySearch = edtSearch.getText().toString();
        if (keySearch.isEmpty()) {
            Toast.makeText(this,
                    "Key search is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        Api api = ApiBuilder.getInstance();
        api.getNews(
                keySearch,
                "f70e06a71e524dfa86dbfcf7ca38e62f",
                "vi"
        ).enqueue(this);
    }

    @Override
    public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
        adapter.setData(response.body().getData());
    }

    @Override
    public void onFailure(Call<NewsResponse> call, Throwable t) {

    }
}
