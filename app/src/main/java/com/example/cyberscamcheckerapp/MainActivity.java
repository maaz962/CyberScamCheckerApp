package com.example.cyberscamcheckerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnUrl, btnMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUrl = findViewById(R.id.btnUrl);
        btnMessage = findViewById(R.id.btnMessage);

        btnUrl.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, UrlActivity.class));
        });

        btnMessage.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, MessageActivity.class));
        });
    }
}