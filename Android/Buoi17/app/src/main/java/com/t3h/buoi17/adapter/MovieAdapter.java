package com.t3h.buoi17.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.t3h.buoi17.R;
import com.t3h.buoi17.model.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> implements Filterable {
    private LayoutInflater inflater;
    private ArrayList<Movie> data;
    private ArrayList<Movie> filterData;

    public MovieAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<Movie> data) {
        this.data = data;
        filterData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_movie, parent, false);
        return new MovieHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {
        holder.bindData(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public Filter getFilter() {
        return new MovieFilter();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {
        private ImageView imMovie;
        private TextView tvTitle;
        private TextView tvYear;
        private TextView tvGenre;
        private RatingBar ratingBar;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);
            imMovie = itemView.findViewById(R.id.im_movie);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvYear = itemView.findViewById(R.id.tv_year);
            tvGenre = itemView.findViewById(R.id.tv_genre);
            ratingBar = itemView.findViewById(R.id.rating);
        }

        public void bindData(Movie movie) {
            tvTitle.setText(movie.getTitle());
            tvYear.setText(movie.getYear());
            String genre = "";
            for (String g : movie.getGenre()) {
                genre += g + ",";
            }
            genre = genre.substring(0, genre.length() - 1);
            tvGenre.setText(genre);
            ratingBar.setRating(movie.getRating());
            Glide.with(imMovie)
                    .load(movie.getImage())
                    .into(imMovie);
        }
    }

    public class MovieFilter extends Filter {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            String key = constraint.toString().toLowerCase();
            ArrayList<Movie> result = new ArrayList<>();
            for (Movie m: filterData) {
                if (m.getTitle().toLowerCase().contains(key)){
                    result.add(m);
                }
            }
            FilterResults filterResults = new FilterResults();
//            filterResults.count = result.size();
            filterResults.values = result;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            data = (ArrayList<Movie>) results.values;
            notifyDataSetChanged();
        }
    }
}
