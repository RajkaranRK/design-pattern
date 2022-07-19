package com.rk.dp.structural.adapter;

public class Mp4Player implements AdvancePlayer{

    @Override
    public void playMp4(String file) {
       System.out.println("Playing Mp4"+file);
    }

    @Override
    public void playWav(String file) {
        System.out.println("can't play this format of file");
    }
    
}
