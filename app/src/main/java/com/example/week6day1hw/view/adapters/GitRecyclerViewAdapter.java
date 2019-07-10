package com.example.week6day1hw.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.week6day1hw.R;

import java.util.List;

public class GitRecyclerViewAdapter extends RecyclerView.Adapter<GitRecyclerViewAdapter.ViewHolder> {

    @NonNull
    @Override
    public GitRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GitRecyclerViewAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvId;
        TextView tvRepoName;
        TextView tvLanguage;
        TextView tvSize;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvId = itemView.findViewById(R.id.tvId);
            tvRepoName = itemView.findViewById(R.id.tvRepoName);
            tvLanguage = itemView.findViewById(R.id.tvLanguage);
            tvSize = itemView.findViewById(R.id.tvSize);
        }
    }
}

