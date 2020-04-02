package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        List<Fruit> fruitList = new ArrayList<>();
        fruitList = initData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //线性布局管理器LinearLayoutManger
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //默认是垂直分布的
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        //网格布局管理器
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        //瀑布流布局
//        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
//        FruitRecyclerViewAdapter adapter = new FruitRecyclerViewAdapter(fruitList);
//        recyclerView.setAdapter(adapter);
        FruitRecyclerViewAdapter adapter =new FruitRecyclerViewAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private List<Fruit> initData(){
        List<Fruit> data = new ArrayList<>();
        data.add(new Fruit(R.drawable.apple,"Apple","big apple","123456"));
        data.add(new Fruit(R.drawable.banana,"Banana","big banana","123456"));
        data.add(new Fruit(R.drawable.blackberry,"Blackberry","big blackberry","123456"));
        data.add(new Fruit(R.drawable.cherries,"Cherries","big cherries","123456"));
        data.add(new Fruit(R.drawable.coconut,"Coconut","big coconut","123456"));
        data.add(new Fruit(R.drawable.grape,"Grape","big grape","123456"));
        data.add(new Fruit(R.drawable.kiwi,"Kiwi","big kiwi","123456"));
        return data;
    }
}
