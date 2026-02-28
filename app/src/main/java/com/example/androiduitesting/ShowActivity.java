package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityTextView = findViewById(R.id.textView_cityName);
        Button backButton = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String cityName = intent.getStringExtra("CITY_NAME");

        if (cityName != null) {

            cityTextView.setText(cityName);

        }

        backButton.setOnClickListener(v -> finish());

    }

}