package com.rk.dp.structural.proxy.dynamicproxy;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
    
    private String name;
    
    private Point2D location;
    
    
    public BitmapImage(String fileName) {
        //load from disk here
        this.name = fileName;
    }

    @Override
    public void setLocation(Point2D point) {
        this.location = point;
        
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
       System.out.println("Rendered File "+name);
    }

}
