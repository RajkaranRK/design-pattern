package com.rk.dp.structural.proxy.dynamicproxy;

import java.awt.geom.Point2D;

public interface Image {
    
    public void setLocation(Point2D point);
    
    public Point2D getLocation();
    
    public void render();
    
}
