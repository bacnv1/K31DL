package com.t3h.demofirebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatApdater extends RecyclerView.Adapter<ChatApdater.ChatHolder> {
    private ArrayList<Chat> data;
    private LayoutInflater inflater;

    public ChatApdater(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<Chat> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_chat, parent, false);
        return new ChatHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ChatHolder extends RecyclerView.ViewHolder{
        private TextView tvName;
        private TextView tvDate;
        private TextView tvMessage;
        public ChatHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvMessage = itemView.findViewById(R.id.tv_message);
            tvName = itemView.findViewById(R.id.tv_name);
        }

        public void bindData(Chat item){
            tvName.setText(item.getName());
            tvMessage.setText(item.getMessage());
            tvDate.setText(item.getDate());
        }
    }
}
