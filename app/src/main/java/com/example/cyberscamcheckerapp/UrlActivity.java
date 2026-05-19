package com.example.cyberscamcheckerapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UrlActivity extends AppCompatActivity {

    EditText etUrl;
    Button btnCheck;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        etUrl = findViewById(R.id.etUrl);
        btnCheck = findViewById(R.id.btnCheck);
        tvResult = findViewById(R.id.tvResult);

        btnCheck.setOnClickListener(v -> {

            String url = etUrl.getText().toString().trim().toLowerCase();

            if (url.isEmpty()) {
                tvResult.setText("⚠️ Please enter a URL");
                tvResult.setTextColor(Color.BLACK);
                tvResult.setBackgroundColor(Color.YELLOW);
                tvResult.setPadding(20, 20, 20, 20);
                return;
            }

            if (url.contains("bank") ||
                    url.contains("otp") ||
                    url.contains("login") ||
                    url.contains("verify") ||
                    url.contains("urgent") ||
                    url.contains("account")) {

                tvResult.setText("⚠️ SCAM URL DETECTED");
                tvResult.setTextColor(Color.BLACK);
                tvResult.setBackgroundColor(Color.RED);

            } else {

                tvResult.setText("✅ SAFE URL");
                tvResult.setTextColor(Color.BLACK);
                tvResult.setBackgroundColor(Color.GREEN);
            }

            tvResult.setPadding(20, 20, 20, 20);
        });
    }
}