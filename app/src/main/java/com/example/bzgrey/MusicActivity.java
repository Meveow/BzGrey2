package com.example.bzgrey;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MusicActivity extends AppCompatActivity {

    private List<Song> songList;
    private SongAdapter songAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        Button homeButton = findViewById(R.id.home);
        RecyclerView songRecyclerView = findViewById(R.id.song_list);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button moviesButton = findViewById(R.id.news_button);
        Button musicButton = findViewById(R.id.movies_button);
        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicActivity.this, EntertainmentNewsPage.class);
                startActivity(intent);
            }
        });
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicActivity.this, MoviesActivity.class);
                startActivity(intent);
            }
        });
        // Initialize song list and adapter
        songList = createSampleSongList();
        songAdapter = new SongAdapter(songList);

        // Set up RecyclerView
        songRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        songRecyclerView.setAdapter(songAdapter);
    }

    private List<Song> createSampleSongList() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(R.drawable.song1_cover, "Hey Jude", "The Beatles", R.raw.song_1));
        songs.add(new Song(R.drawable.song2_cover, "Can't help falling in love", "Elvis Presley", R.raw.song2));
        songs.add(new Song(R.drawable.song3_cover, "Cater 2 U", "Destiny's Child", R.raw.song3));
        songs.add(new Song(R.drawable.song4_cover, "Let it be", "The Beatles", R.raw.song4));
        return songs;
    }
}
