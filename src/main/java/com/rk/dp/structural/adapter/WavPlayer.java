package com.rk.dp.structural.adapter;

public class WavPlayer implements AdvancePlayer {

    @Override
    public void playMp4(String file) {
       System.out.println("Can't play such format of file");
        
    }

    @Override
    public void playWav(String file) {
        System.out.println("Playing Wav file"+file);
        
    }

}
