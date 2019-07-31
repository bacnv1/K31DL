package com.t3h.filternews.adapter;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.widget.PopupMenu;

import com.t3h.filternews.R;

public class SavedAdapter extends BaseAdapter{

    private SavedItemListener listener;

    public SavedAdapter(Context context) {
        super(context);
    }

    public void setListener(SavedItemListener listener) {
        this.listener = listener;
    }

    @Override
    protected void decodeView(final BaseHolder holder, final int position) {
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.savedItemClicked(position);
            }
        });
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                PopupMenu menu = new PopupMenu(
                        holder.itemView.getContext(),
                        holder.itemView
                );
                menu.inflate(R.menu.menu_save);
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.menu_delete:
                                listener.deleteItemClicked(position);
                                break;
                            case R.id.menu_favorite:
                                listener.favoriteItemClicked(position);
                                break;
                        }
                        return true;
                    }
                });
                menu.show();
                return true;
            }
        });
    }

    public interface SavedItemListener {
        void savedItemClicked(int position);
        void deleteItemClicked(int position);
        void favoriteItemClicked(int position);
    }
}
