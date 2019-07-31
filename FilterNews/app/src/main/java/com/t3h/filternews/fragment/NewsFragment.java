package com.t3h.filternews.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.filternews.R;
import com.t3h.filternews.activity.MainActivity;
import com.t3h.filternews.activity.NewsActivity;
import com.t3h.filternews.adapter.NewsAdapter;
import com.t3h.filternews.api.AppDatabase;
import com.t3h.filternews.model.News;

import java.util.ArrayList;

public class NewsFragment extends Fragment implements NewsAdapter.NewsItemListener {

    private RecyclerView lvNews;
    private NewsAdapter adapter;
    private ArrayList<News> data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_news, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lvNews = getActivity().findViewById(R.id.lv_news);
        adapter = new NewsAdapter(getContext());
        adapter.setListener(this);
        lvNews.setAdapter(adapter);
        adapter.setData(data);
    }

    public void setData(ArrayList<News> data) {
        this.data = data;
        adapter.setData(data);
    }

    @Override
    public void onNewsItemClicked(int position) {
        Intent intent = NewsActivity.getInstance(getContext(), data.get(position).getUrl());
        startActivity(intent);
    }

    @Override
    public void onNewsItemLongClicked(int position) {
        try {
            AppDatabase.getInstance(getContext())
                    .getNewsDao().insert(data.get(position));
            MainActivity act = (MainActivity) getActivity();
            act.getFmSaved().getData();
            Toast.makeText(getContext(), "News saved", Toast.LENGTH_LONG).show();
        }catch (Exception ex){
            Toast.makeText(getContext(), "News already saved", Toast.LENGTH_LONG).show();
        }
    }
}
