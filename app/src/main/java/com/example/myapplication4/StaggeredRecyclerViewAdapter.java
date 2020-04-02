package com.example.myapplication4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StaggeredRecyclerViewAdapter extends RecyclerView.Adapter<StaggeredRecyclerViewAdapter.ViewHolder> {
//    private List<Fruit> fruitList;

    public StaggeredRecyclerViewAdapter() {

    }

    @NonNull
    @Override
    public StaggeredRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.staggered_item,null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StaggeredRecyclerViewAdapter.ViewHolder holder, int position) {
        if (position%2!=0){
            holder.staggerImage.setImageResource(R.drawable.apple);
        }else {
            holder.staggerImage.setImageResource(R.drawable.can);
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView staggerImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            staggerImage = itemView.findViewById(R.id.StaggeredImage);

        }
    }

}
