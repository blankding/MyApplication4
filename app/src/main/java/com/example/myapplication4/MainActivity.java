package com.example.myapplication4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {// implements View.OnClickListener{
    private ImageView imageView;
    private int a=0;
    final Integer[] m = { R.drawable.img4,R.drawable.jin,R.drawable.img3
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==200&&resultCode==RESULT_OK){
            String returnData =data.getStringExtra("return data");
            Log.d("return data",returnData);
        }
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        Log.d("onCreate", "onCreate:正在执行");
        imageView = (ImageView) findViewById(R.id.imageView);
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button1);
        final ImageSwitcher imageSwitcher = findViewById(R.id.imgSwitch);
        imageSwitcher.setOutAnimation(MainActivity.this, android.R.anim.fade_out);
        imageSwitcher.setInAnimation(MainActivity.this, android.R.anim.fade_in);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.img3);
                return imageView;
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    imageSwitcher.setImageResource(++m[a]);
                if (a==m.length) {
                    a=-1;
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageSwitcher.setImageResource(--m[a]);
            }
        });


    }


}
