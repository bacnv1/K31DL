package com.t3h.filternews.adapter;

import android.content.Context;
import android.view.View;

public class NewsAdapter extends BaseAdapter{
    private NewsItemListener listener;

    public NewsAdapter(Context context) {
        super(context);
    }

    public void setListener(NewsItemListener listener) {
        this.listener = listener;
    }

    @Override
    protected void decodeView(BaseHolder holder, final int position) {
        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onNewsItemClicked(position);
                }
            });

            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    listener.onNewsItemLongClicked(position);
                    return true;
                }
            });
        }
    }

    public interface NewsItemListener{
        void onNewsItemClicked(int position);
        void onNewsItemLongClicked(int position);
    }
}
