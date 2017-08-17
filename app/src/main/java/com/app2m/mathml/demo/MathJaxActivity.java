package com.app2m.mathml.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MathJaxActivity extends AppCompatActivity {
    private static final String INTENT_KEY_LATEX_URL = "latex_url";
    private WebView mWebView;

    public static Intent getIntent(Context context, String latexUrl) {
        Intent intent = new Intent(context, MathJaxActivity.class);
        intent.putExtra(INTENT_KEY_LATEX_URL, latexUrl);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latex_activity_math_jax);
        String latexUrl = getIntent().getStringExtra(INTENT_KEY_LATEX_URL);
        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.loadUrl(latexUrl);
        //设置编码
        mWebView.getSettings().setDefaultTextEncodingName("utf-8");
        //支持js
        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE); // 根据cache-control决定是否从网络上获取数据
        mWebView.getSettings().setDomStorageEnabled(true); // 开启 DOM storage 本地化存储
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setBuiltInZoomControls(true);

    }
}
