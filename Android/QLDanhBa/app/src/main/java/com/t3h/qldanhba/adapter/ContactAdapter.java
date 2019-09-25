package com.t3h.qldanhba.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.t3h.qldanhba.R;
import com.t3h.qldanhba.models.Contact;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactHolder> {
    private ArrayList<Contact> data;
    private LayoutInflater inflater;
    private ItemContactListener listener;

    public ContactAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<Contact> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void setListener(ItemContactListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = inflater.inflate(R.layout.contact_item, viewGroup, false);
        return new ContactHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactHolder contactHolder, int i) {
        final Contact item = data.get(i);
        contactHolder.bindData(item);
        if (listener != null) {
            contactHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onEdit(item);
                }
            });
            contactHolder.imMessage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onMessage(item);
                }
            });
            contactHolder.imCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onCall(item);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class ContactHolder extends RecyclerView.ViewHolder {
        private ImageView imAvatar;
        private TextView tvName;
        private TextView tvPhone;
        private ImageView imCall;
        private ImageView imMessage;
        public ContactHolder(View itemView) {
            super(itemView);
            imAvatar = itemView.findViewById(R.id.im_avatar);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPhone = itemView.findViewById(R.id.tv_phone);
            imCall = itemView.findViewById(R.id.im_call);
            imMessage = itemView.findViewById(R.id.im_message);
        }

        private void bindData(Contact item) {
            tvName.setText(item.getName());
            tvPhone.setText(item.getPhone());
            Glide.with(imAvatar)
                    .load(item.getAvatar())
                    .error(R.drawable.user)
                    .into(imAvatar);
        }
    }

    public interface ItemContactListener {
        void onEdit(Contact item);
        void onCall(Contact item);
        void onMessage(Contact item);
    }
}
