package com.t3h.filternews.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.filternews.R;
import com.t3h.filternews.activity.NewsActivity;
import com.t3h.filternews.adapter.SavedAdapter;
import com.t3h.filternews.api.AppDatabase;
import com.t3h.filternews.model.News;

import java.util.ArrayList;

public class SavedFragment extends Fragment implements SavedAdapter.SavedItemListener {

    private RecyclerView lvSaved;
    private SavedAdapter adapter;
    private ArrayList<News> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_saved, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lvSaved = getActivity().findViewById(R.id.lv_saved);
        adapter = new SavedAdapter(getContext());
        adapter.setListener(this);
        lvSaved.setAdapter(adapter);
        getData();
    }

    public void getData() {
        data.clear();
        data.addAll(AppDatabase.getInstance(getContext()).getNewsDao().getSaved());
        adapter.setData(data);
    }

    @Override
    public void savedItemClicked(int position) {
        Intent intent = NewsActivity.getInstance(getContext(), data.get(position).getUrl());
        startActivity(intent);
    }

    @Override
    public void deleteItemClicked(int position) {
        AppDatabase.getInstance(getContext()).getNewsDao().delete(data.get(position));
        getData();
    }

    @Override
    public void favoriteItemClicked(int position) {
        News news = data.get(position);
        news.setFavorite(true);
        AppDatabase.getInstance(getContext()).getNewsDao().update(news);
    }
}
