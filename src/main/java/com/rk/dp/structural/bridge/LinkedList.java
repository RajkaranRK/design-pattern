package com.rk.dp.structural.bridge;

public interface LinkedList<T> {
    
    public void addFirst(T t);
    
    public void addLast(T t);
    
    public T getFirst();
    
    public T getLast();
    
    public int getSize();
}
