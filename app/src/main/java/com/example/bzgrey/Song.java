package com.example.bzgrey;

public class Song {
    private int cover;
    private String name;
    private String singer;
    private int audioResourceId;

    public Song(int cover, String name, String singer, int audioResourceId) {
        this.cover = cover;
        this.name = name;
        this.singer = singer;
        this.audioResourceId = audioResourceId;
    }

    public int getCover() {
        return cover;
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
