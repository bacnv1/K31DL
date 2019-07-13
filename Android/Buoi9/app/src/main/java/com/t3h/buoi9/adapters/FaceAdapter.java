package com.t3h.buoi9.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.buoi9.R;
import com.t3h.buoi9.models.Face;

import java.util.ArrayList;

public class FaceAdapter extends RecyclerView.Adapter<FaceAdapter.FaceHolder>{

    private LayoutInflater inflater;
    private ArrayList<Face> data;
    private ItemFaceClickListener listener;

    public FaceAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public void setListener(ItemFaceClickListener listener) {
        this.listener = listener;
    }

    public void setData(ArrayList<Face> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.e(getClass().getSimpleName(), "onCreateViewHolder");
        View v = inflater.inflate(R.layout.item_face,
                parent, false);
        return new FaceHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FaceHolder holder, final int position) {
        Face item = data.get(position);
        holder.bindData(item);
        Log.e(getClass().getSimpleName(), "onBindViewHolder - " + position);
        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemFaceClicked(position);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    listener.onItemFaceLongClicked(position);
                    return true;
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class FaceHolder extends RecyclerView.ViewHolder {
        private ImageView imFace;
        private TextView tvName;

        public FaceHolder(@NonNull View itemView) {
            super(itemView);
            imFace = itemView.findViewById(R.id.im_face);
            tvName = itemView.findViewById(R.id.tv_name);
        }

        public void bindData(Face item) {
            imFace.setImageResource(item.getImg());
            tvName.setText(item.getName());
        }
    }

    public interface ItemFaceClickListener {
        void onItemFaceClicked(int position);
        void onItemFaceLongClicked(int position);
    }
}
