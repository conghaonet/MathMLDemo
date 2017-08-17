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

    public void onClickMathJax(View view) {
        startActivity(MathJaxActivity.getIntent(this, "file:///android_asset/demo/demo1.html"));
    }
}
