package com.zaksontech.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvResult = findViewById(R.id.tv_response);
        try {
            URL bookUrl = ApiUtil.buildUrl("cooking");
            String jsonResult = ApiUtil.getJSON(bookUrl);
            tvResult.setText(jsonResult);
        }
        catch (Exception e) {
            Log.d("error", e.getMessage());
        }
    }
}