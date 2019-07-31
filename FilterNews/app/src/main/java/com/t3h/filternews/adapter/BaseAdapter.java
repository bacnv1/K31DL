package com.t3h.filternews.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.t3h.filternews.R;
import com.t3h.filternews.model.News;

import java.util.ArrayList;

public abstract class BaseAdapter extends RecyclerView.Adapter<BaseAdapter.BaseHolder>{
    private LayoutInflater inflater;
    private ArrayList<News> data;

    public BaseAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<News> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_view, parent, false);
        return new BaseHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseHolder holder, int position) {
        holder.binData(data.get(position));
        decodeView(holder, position);
    }

    protected abstract void decodeView(BaseHolder holder
            , int position);

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class BaseHolder extends RecyclerView.ViewHolder{
        private ImageView imImage;
        private TextView tvTitle;
        private TextView tvDes;
        private TextView tvDate;
        public BaseHolder(@NonNull View itemView) {
            super(itemView);
            imImage = itemView.findViewById(R.id.im_view);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDes = itemView.findViewById(R.id.tv_desc);
            tvDate = itemView.findViewById(R.id.tv_date);
        }
        public void binData(News news){
            tvTitle.setText(news.getTitle());
            tvDes.setText(news.getDesc());
            tvDate.setText(news.getDate());
            Glide.with(imImage).load(news.getImage())
                    .into(imImage);
        }
    }
}
