package com.example.bzgrey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class EntertainmentNewsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment_page);

        Button homeButton = findViewById(R.id.home);
        Button moviesButton = findViewById(R.id.movies_button);
        Button musicButton = findViewById(R.id.music_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntertainmentNewsPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntertainmentNewsPage.this, MoviesActivity.class);
                startActivity(intent);
            }
        });
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntertainmentNewsPage.this, MusicActivity.class);
                startActivity(intent);
            }
        });

        ImageView news1ImageView = findViewById(R.id.news1);
        ImageView news2ImageView = findViewById(R.id.news2);
        ImageView news3ImageView = findViewById(R.id.news3);
        ImageView news4ImageView = findViewById(R.id.news4);

        news1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the behavior when news1 image is clicked
                // For example, start a new activity or show a dialog
                Toast.makeText(EntertainmentNewsPage.this, "Opening news...", Toast.LENGTH_SHORT).show();
            }
        });

        news2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the behavior when news2 image is clicked
                // For example, start a new activity or show a dialog
                Toast.makeText(EntertainmentNewsPage.this, "Opening news...", Toast.LENGTH_SHORT).show();
            }
        });

        news3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the behavior when news3 image is clicked
                // For example, start a new activity or show a dialog
                Toast.makeText(EntertainmentNewsPage.this, "Opening news...", Toast.LENGTH_SHORT).show();
            }
        });

        news4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the behavior when news4 image is clicked
                // For example, start a new activity or show a dialog
                Toast.makeText(EntertainmentNewsPage.this, "Opening news...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}