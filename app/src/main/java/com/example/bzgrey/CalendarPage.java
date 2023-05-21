package com.example.bzgrey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);

        Button homeButton = findViewById(R.id.home);

        homeButton.setOnClickListener(v -> {
            Intent intent = new Intent(CalendarPage.this, MainActivity.class);
            startActivity(intent);
        });

    }
}