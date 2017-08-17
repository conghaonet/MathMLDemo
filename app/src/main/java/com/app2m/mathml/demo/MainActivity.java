package com.app2m.mathml.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latex_activity_main);
    }

    public void onClickDemo(View view) {
        startActivity(MathJaxActivity.getIntent(this, "file:///android_asset/demo/demo.html"));
    }

    public void onClickDemo1(View view) {
        startActivity(MathJaxActivity.getIntent(this, "file:///android_asset/demo/demo1.html"));
    }

    //不显示js加载进度，屏蔽公式右键菜单
    public void onClickDemo2(View view) {
        startActivity(MathJaxActivity.getIntent(this, "file:///android_asset/demo/demo2.html"));
    }
}
