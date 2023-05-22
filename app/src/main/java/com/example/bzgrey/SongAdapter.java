package com.example.bzgrey;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    private List<Song> songList;

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Song song = songList.get(position);
        holder.songCover.setImageResource(song.getCover());
        holder.songName.setText(song.getName());
        holder.singerName.setText(song.getSinger());
        holder.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Playing " + song.getName() + " By " + song.getSinger(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView songCover;
        TextView songName;
        TextView singerName;
        Button playButton;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            songCover = itemView.findViewById(R.id.song_cover);
            songName = itemView.findViewById(R.id.song_name);
            singerName = itemView.findViewById(R.id.singer_name);
            playButton = itemView.findViewById(R.id.play_button);
        }
    }
}
