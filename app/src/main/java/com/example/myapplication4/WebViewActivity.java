package com.example.myapplication4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView = findViewById(R.id.Webview);
        webView.getSettings().setJavaScriptEnabled(true);//运行加载JS脚本
        webView.setWebViewClient(new WebViewClient());//允许在应用程序内从一个网页跳转到另一个网页
        webView.loadUrl("http://www.baidu.com");//加载的网页地址
    }
}
