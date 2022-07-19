package com.rk.dp.structural.proxy.dynamicproxy;

import java.awt.Point;

public class Client {
    
    
    public static void main(String []args) {
        Image image = ImageFactory.createImage("my-photo.png");
        image.setLocation(new Point(12, 12));
        System.out.println("Image Location "+image.getLocation());
        image.render();
    }

}
