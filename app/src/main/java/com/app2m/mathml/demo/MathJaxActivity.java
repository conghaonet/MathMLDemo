package com.app2m.mathml.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MathJaxActivity extends AppCompatActivity {
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_jax);
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.loadUrl("file:///android_asset/mathjax.html");
        //设置编码
        mWebView.getSettings().setDefaultTextEncodingName("utf-8");
        //支持js
        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT); // 根据cache-control决定是否从网络上获取数据
        mWebView.getSettings().setDomStorageEnabled(true); // 开启 DOM storage 本地化存储

    }
}
