package com.example.bzgrey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        Button homeButton = findViewById(R.id.home);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoviesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button moviesButton = findViewById(R.id.news_button);
        Button musicButton = findViewById(R.id.music_button);
        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoviesActivity.this, EntertainmentNewsPage.class);
                startActivity(intent);
            }
        });
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoviesActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });

        ImageView movies1 = findViewById(R.id.movies1);
        ImageView movies2 = findViewById(R.id.movies2);

        movies1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MoviesActivity.this, "Playing movie...", Toast.LENGTH_SHORT).show();
            }
        });

        movies2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MoviesActivity.this, "Playing movie...", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
