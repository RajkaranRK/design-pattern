package com.rk.dp.structural.bridge;

public interface FifoCollection<T> {
    
    public void offer(T t);
    
    public T poll();

}
