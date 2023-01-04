package com.rk.dp.solid.liskov.violated;

public class Client {

    public static void main(String []args){
        Rectangle rectangle = new Rectangle(10,12);
        Square square = new Square(10,20);

        useRectangle(rectangle);
        useRectangle(square);
    }

    private static void useRectangle(Rectangle rectangle){
        int width = 20;
        int height = 30;
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        assert rectangle.getHeight() == height : "Height not equal to 30";
        assert rectangle.getWidth() == width : "Width not equal to 20";
        int area = width * height;
        assert area == rectangle.computeArea() : "Area should be same";
        System.out.println("Computed area "+rectangle.computeArea() +" expected area "+area);

    }
}
