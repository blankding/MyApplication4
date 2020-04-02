package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
//    private String[] data = {"Apple","Banana","Orange","Watermelon","pear","Grape","Pineapple","Apple","Banana","Orange","Watermelon","pear","Grape","Pineapple"};
    private List<Fruit> data =initData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_viewactivity);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView = findViewById(R.id.list_view1);
//        listView.setAdapter(adapter);

        FruitAdapter fruitAdapter = new FruitAdapter(ListViewActivity.this,R.layout.fruit_item,data);
        ListView listView = findViewById(R.id.list_view1);
        listView.setAdapter(fruitAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = data.get(position);
                Toast.makeText(ListViewActivity.this,fruit.getImage_name(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private List<Fruit> initData(){
        List<Fruit> data = new ArrayList<>();
        data.add(new Fruit(R.drawable.apple,"Apple","big apple","1"));
        data.add(new Fruit(R.drawable.banana,"Banana","big banana","2"));
        data.add(new Fruit(R.drawable.blackberry,"Blackberry","big blackberry","3"));
        data.add(new Fruit(R.drawable.cherries,"Cherries","big cherries","4"));
        data.add(new Fruit(R.drawable.coconut,"Coconut","big coconut","5"));
        data.add(new Fruit(R.drawable.grape,"Grape","big grape","6"));
        data.add(new Fruit(R.drawable.kiwi,"Kiwi","big kiwi","7"));
        return data;
    }
}


