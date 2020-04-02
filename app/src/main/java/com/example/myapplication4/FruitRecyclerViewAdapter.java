package com.example.myapplication4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitRecyclerViewAdapter extends RecyclerView.Adapter<FruitRecyclerViewAdapter.ViewHolder> {
    private List<Fruit> fruitList;

    public FruitRecyclerViewAdapter(List<Fruit> mFruitList) {
        this.fruitList = mFruitList;
    }

    @NonNull
    @Override
    public FruitRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,null);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit =fruitList.get(position);
                Toast.makeText(v.getContext(),"你点击的是"+fruit.getImage_name()+"的图片",Toast.LENGTH_LONG).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitRecyclerViewAdapter.ViewHolder holder, int position) {
        Fruit fruit = fruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImage_id());
        holder.fruitName.setText(fruit.getImage_name());
        holder.fruitDescripe.setText(fruit.getImage_descripe());
        holder.fruitContent.setText(fruit.getImage_Content());
    }

    @Override
    public int getItemCount() {
        return fruitList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        TextView fruitDescripe;
        TextView fruitContent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fruitImage = itemView.findViewById(R.id.fruitImage);
            fruitName = itemView.findViewById(R.id.fruitText);
            fruitDescripe = itemView.findViewById(R.id.fruitDescripe);
            fruitContent = itemView.findViewById(R.id.fruitContent);
        }
    }

}
