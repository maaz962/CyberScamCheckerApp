package com.example.cyberscamcheckerapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    EditText etMessage;
    Button btnCheckMsg;
    TextView tvMsgResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        etMessage = findViewById(R.id.etMessage);
        btnCheckMsg = findViewById(R.id.btnCheckMsg);
        tvMsgResult = findViewById(R.id.tvMsgResult);

        btnCheckMsg.setOnClickListener(v -> {

            String msg = etMessage.getText().toString().trim().toLowerCase();

            if (msg.isEmpty()) {
                tvMsgResult.setText("⚠️ Please enter a message");
                tvMsgResult.setTextColor(Color.BLACK);
                tvMsgResult.setBackgroundColor(Color.YELLOW);
                tvMsgResult.setPadding(20, 20, 20, 20);
                return;
            }

            if (msg.contains("otp") ||
                    msg.contains("bank") ||
                    msg.contains("urgent") ||
                    msg.contains("click") ||
                    msg.contains("winner") ||
                    msg.contains("lottery") ||
                    msg.contains("account")) {

                tvMsgResult.setText("⚠️ SCAM MESSAGE DETECTED");
                tvMsgResult.setTextColor(Color.BLACK);
                tvMsgResult.setBackgroundColor(Color.RED);

            } else {

                tvMsgResult.setText("✅ MESSAGE LOOKS SAFE");
                tvMsgResult.setTextColor(Color.BLACK);
                tvMsgResult.setBackgroundColor(Color.GREEN);
            }

            tvMsgResult.setPadding(20, 20, 20, 20);
        });
    }
}