package com.rk.dp.structural.adapter;

public class Client {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","bhakti.mp3");
        audioPlayer.play("mp4","bhakti.mp4");
        audioPlayer.play("wav","bhakti.wav");
        audioPlayer.play("web", "bhakti.web");
    }
}
