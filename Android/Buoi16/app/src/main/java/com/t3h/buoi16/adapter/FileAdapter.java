package com.t3h.buoi16.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.t3h.buoi16.R;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.FileHolder>{
    private File[] data;
    private LayoutInflater inflater;
    private FileItemListener listener;

    public FileAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setData(File[] data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void setListener(FileItemListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public FileHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_view, parent, false);
        return new FileHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FileHolder holder, final int position) {
        holder.bindData(data[position]);
        if (listener != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemFileClicked(data[position]);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.length;
    }

    public class FileHolder extends RecyclerView.ViewHolder {
        private ImageView imFile;
        private TextView tvSize;
        private TextView tvName;
        private TextView tvDate;
        private SimpleDateFormat format =
                new SimpleDateFormat("dd/MM/yyy");

        public FileHolder(@NonNull View itemView) {
            super(itemView);
            imFile = itemView.findViewById(R.id.im_file);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvName = itemView.findViewById(R.id.tv_name);
            tvSize = itemView.findViewById(R.id.tv_size);
        }

        public void bindData(File file) {
            if (file.isFile()) {
                imFile.setImageResource(R.drawable.ic_file);
                tvSize.setText(readableFileSize(file.length()));

            }else {
                imFile.setImageResource(R.drawable.ic_folder);
                tvSize.setText("--");
            }
            tvName.setText(file.getName());
            tvDate.setText(format.format(file.lastModified()));
        }

        public String readableFileSize(long size) {
            if(size <= 0) return "0";
            final String[] units = new String[] { "B", "kB", "MB", "GB", "TB" };
            int digitGroups = (int) (Math.log10(size)/Math.log10(1024));
            return new DecimalFormat("#,##0.#").format(size/Math.pow(1024, digitGroups)) + " " + units[digitGroups];
        }

    }
    public interface FileItemListener {
        void onItemFileClicked(File file);
    }
}
