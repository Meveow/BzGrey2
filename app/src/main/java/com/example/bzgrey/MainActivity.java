package com.example.bzgrey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button patientInfoButton = findViewById(R.id.patient_info);
        Button calenderPageButton = findViewById(R.id.calendar_button);
        Button entertainmentPageButton = findViewById(R.id.entertainment_button);

        patientInfoButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PatientInfo.class);
            startActivity(intent);
        });
        calenderPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CalenderPage.class);
            startActivity(intent);
        });
        entertainmentPageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EntertainmentPage.class);
            startActivity(intent);
        });

    }
}