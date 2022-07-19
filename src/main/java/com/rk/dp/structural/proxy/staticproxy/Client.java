package com.rk.dp.structural.proxy.staticproxy;

import java.awt.Point;

public class Client {
    
    
    public static void main(String []args) {
        Image image = ImageFactory.createImage("my-photo.png");
        image.setLocation(new Point(12, 12));
        
        System.out.println("Image Location "+ image.getLocation());
        
        System.out.println("Rendering Image now .......");
        image.render();
    }

}
