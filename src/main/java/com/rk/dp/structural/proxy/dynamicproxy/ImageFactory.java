package com.rk.dp.structural.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class ImageFactory {
    
    public static Image createImage(String fileName) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler(fileName));   
    }

}
