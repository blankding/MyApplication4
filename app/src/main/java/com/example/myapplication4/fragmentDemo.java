package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fragmentDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_demo);
        Button button = findViewById(R.id.button_fragment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //1.实例化自定义的fragment
                Fragment3 fragment3 = new Fragment3();
                Fragment2 fragment2 = new Fragment2();
                //2.获取FragmentManage
                FragmentManager fragmentManager = getSupportFragmentManager();
                //3.获取FragmentTransaction，动态加载
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.remove(fragment2);
                transaction.add(R.id.fragment_layout,fragment3);
                //4.提交事务
                transaction.commit();
            }
        });
    }
}
