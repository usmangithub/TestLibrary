package com.example.usuma.testlibary;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.style.TtsSpan;
import android.widget.TextView;

import com.example.mylibrary.TestContent;


/**
 * Created by Usman on 12/06/2018.
 */
public class TestActivity extends Activity {
    TestContent asd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
        asd = new TestContent("Testssssssssssssssssssssssssssssssssssssssssssssssssss");
        TextView txtV = (TextView) findViewById(R.id.txtTv);
        txtV.setText(asd.getTestStr());
    }
}
