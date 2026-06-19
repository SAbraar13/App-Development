package com.example.countapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView counterText;
    private Button btnIncrement;
    private Button btnDecrement;
    private Button btnReset;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.counterText);
        btnIncrement = findViewById(R.id.btnIncrement);
        btnDecrement = findViewById(R.id.btnDecrement);
        btnReset = findViewById(R.id.btnReset);

        btnIncrement.setOnClickListener(v -> {
            count++;
            counterText.setText(String.valueOf(count));
        });

        btnDecrement.setOnClickListener(v -> {
            count--;
            counterText.setText(String.valueOf(count));
        });

        btnReset.setOnClickListener(v -> {
            count = 0;
            counterText.setText(String.valueOf(count));
        });
    }
}