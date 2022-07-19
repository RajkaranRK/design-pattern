package com.rk.dp.structural.proxy.staticproxy;

public class ImageFactory {
    
    
    public static Image createImage(String fileName) {
        return new ImageProxy(fileName);
    }

}
