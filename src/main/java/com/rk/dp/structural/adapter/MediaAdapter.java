package com.rk.dp.structural.adapter;

public class MediaAdapter implements MediaPlayer {
    
    private AdvancePlayer advancePlayer;
    
    public MediaAdapter(String format) {
        if(format.equals("mp4")) {
            advancePlayer = new Mp4Player();
        }else if(format.equals("wav")) {
            advancePlayer = new WavPlayer();
        }
    }

    @Override
    public void play(String format, String file) {
        if(format.equals("mp4")) {
            advancePlayer.playMp4(file);
        }else if(format.equals("wav")) {
            advancePlayer.playWav(file);
        }else {
            System.out.println("format not supported");
        }
    }

}
