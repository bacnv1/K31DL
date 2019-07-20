package com.t3h.buoi11.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.buoi11.R;
import com.t3h.buoi11.model.Student;

import java.util.List;
import java.util.Random;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentHolder> {

    private LayoutInflater inflater;
    private List<Student> data;
    private ItemStudentListener listener;

    public StudentAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setListener(ItemStudentListener listener) {
        this.listener = listener;
    }

    public void setData(List<Student> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public StudentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_student, parent, false);
        return new StudentHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentHolder holder, final int position) {
        holder.bindData(data.get(position));
        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemStudentClicked(position);
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    listener.onItemStudentLongClicked(position);
                    return true;
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    public class StudentHolder extends RecyclerView.ViewHolder {
        private TextView tvIcon;
        private TextView tvName;
        private TextView tvSubject;
        private TextView tvScore;
        public StudentHolder(@NonNull View itemView) {
            super(itemView);
            tvIcon = itemView.findViewById(R.id.tv_icon);
            tvName = itemView.findViewById(R.id.tv_name);
            tvSubject = itemView.findViewById(R.id.tv_subject);
            tvScore = itemView.findViewById(R.id.tv_score);
        }

        public void bindData(Student item) {
            tvIcon.setText(item.getName().charAt(0) + "");
            tvName.setText(item.getName());
            tvScore.setText(item.getScore()+"");
            tvSubject.setText(item.getSubject());

            GradientDrawable shape =(GradientDrawable) tvIcon.getBackground();
            Random rd = new Random();
            int color = Color.rgb(
                    rd.nextInt(256),
                    rd.nextInt(256),
                    rd.nextInt(256)
            );
            shape.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }
    }

    public interface ItemStudentListener {
        void onItemStudentClicked(int position);
        void onItemStudentLongClicked(int position);
    }
}
