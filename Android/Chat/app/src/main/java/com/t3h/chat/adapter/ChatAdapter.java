package com.t3h.chat.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.chat.R;
import com.t3h.chat.models.Chat;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatHolder> {

    private ArrayList<Chat> data;
    private LayoutInflater inflater;
    private String userName;

    public ChatAdapter(Context context, String userName) {
        inflater = LayoutInflater.from(context);
        this.userName = userName;
    }

    public void setData(ArrayList<Chat> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_chat_left, parent, false);
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
        private LinearLayout lnChat;
        public ChatHolder(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvMessage = itemView.findViewById(R.id.tv_message);
            tvName = itemView.findViewById(R.id.tv_name);
            lnChat = itemView.findViewById(R.id.ln_chat);
        }

        public void bindData(Chat chat) {
            tvName.setText(chat.getName());
            tvMessage.setText(chat.getMessage());
            tvDate.setText(chat.getDate());
            if (chat.getUserName().equals(userName)) {
                lnChat.setGravity(Gravity.RIGHT);
            }else {
                lnChat.setGravity(Gravity.LEFT);
            }
        }
    }
}
