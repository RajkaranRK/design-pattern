package com.rk.dp.structural.proxy.dynamicproxy;

import java.awt.geom.Point2D;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {
    
    private String fileName;
    
    private Point2D location;
    
    private BitmapImage image;
    
    private static Method setLocation;
    
    private static Method getLocation;
    
    private static Method render;
    
    public ImageInvocationHandler(String fileName) {
        this.fileName = fileName;
    }
    
    
    static {
        try {
            setLocation = Image.class.getMethod("setLocation", new Class[] {Point2D.class});
            getLocation = Image.class.getMethod("getLocation", null);
            render = Image.class.getMethod("render", null);
        }catch (NoSuchMethodException  e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Enter invoke()");
        Object object = null;
        if(setLocation.equals(method)) {
            object = setLocationHandle(args);
        }else if(getLocation.equals(method)) {
            object =  getLocationHandle();
        }else if(render.equals(method)) {
            object =  renderHandle();
        }
        System.out.println("Exit invoke()");
        return object;
    }
    
    
    private Object renderHandle() {
        if(image == null) {
            System.out.println("Now creating the actual object...");
            image = new BitmapImage(fileName);
            if(this.location !=null ) {
                image.setLocation(location);
            }
        }
        image.render();
        return null;
    }
    
    
    private Object setLocationHandle(Object[] args) {
        if(image !=null ) {
            image.setLocation((Point2D) args[0]);
        }else {
            this.location = (Point2D) args[0];
        }
        return null;
    }
    
    
    private Object getLocationHandle() {
        if(image!=null) {
            return image.getLocation();
        }else {
            return location;
        }
    }

}
