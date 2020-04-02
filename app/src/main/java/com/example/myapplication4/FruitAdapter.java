package com.example.myapplication4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resource_id;
    public FruitAdapter(@NonNull Context context,  int textViewResourceId, @NonNull List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resource_id = textViewResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Fruit fruit =getItem(position);
        View view;
        ViewHolder viewHolder;
        view = LayoutInflater.from(getContext()).inflate(resource_id,parent,false);
        if (convertView==null){
            view = LayoutInflater.from(getContext()).inflate(resource_id,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = view.findViewById(R.id.fruitImage);
            viewHolder.fruitName = view.findViewById(R.id.fruitText);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImage_id());
        viewHolder.fruitName.setText(fruit.getImage_name());
//        ImageView imageView = view.findViewById(R.id.fruitImage);
//        TextView textView = view.findViewById(R.id.fruitText);
//        imageView.setImageResource(fruit.getImage_id());
//        textView.setText(fruit.getImage_name());
        return view;
    }
    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
