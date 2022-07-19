package com.rk.dp.structural.adapter;

public class AudioPlayer implements MediaPlayer{
    
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String format, String file) {
        if(format.equals("mp3")) {
            System.out.println("Playing mp3");
        }else if(format.equals("mp4") || format.equals("wav")) {
           mediaAdapter = new MediaAdapter(format);
           mediaAdapter.play(format, file);
        }else {
            System.out.println("Format not supported");
        }
    }
}
