package com.rk.dp.structural.proxy.staticproxy;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {
    
    private BitmapImage image;
    
    private String name;
    
    private Point2D location;
    
    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void setLocation(Point2D point) {
        if(image != null ) {
            this.image.setLocation(point);
        }else {
            this.location = point;
        }
    }

    @Override
    public Point2D getLocation() {
        if(image != null) {
            return image.getLocation();
        }
        return location;
    }

    @Override
    public void render() {
        if(image == null) {
            image = new BitmapImage(name);
            if(location != null) {
                this.image.setLocation(location);
            }
        }
        image.render();
    }

}
