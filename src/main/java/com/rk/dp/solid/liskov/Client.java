package com.rk.dp.solid.liskov;

public class Client {
    
    public static void main(String []args) {
        
        Shape shape = new Square(10);
        useShape(shape);
        shape = new Rectangle(10,20);
        useShape(shape);
        
    }
    
    private static void useShape(Shape shape) {
        assert shape instanceof Rectangle && ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth() == shape.computeArea() : "Area is not matched";
        assert shape instanceof Square && ((Square) shape).getSide() * ((Square) shape).getSide() == shape.computeArea() : "Area is not matched"; 
        
    }
}
