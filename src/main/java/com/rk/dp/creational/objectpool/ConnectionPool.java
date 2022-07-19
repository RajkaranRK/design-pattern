package com.rk.dp.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ConnectionPool<T extends ReleaseResource> {
    
    private BlockingQueue<T> objectQueue;
    
    
    public ConnectionPool(Supplier<T> supplier, int n) {
        objectQueue = new LinkedBlockingQueue<>(n);
        for(int i=0; i<n;i++) {
            objectQueue.add(supplier.get());
        }
    }
    
    
    public T getObject(){
        if(objectQueue.isEmpty()) {
            return null;
        }
        return objectQueue.poll();
    }
    
    
    public void release(T t) {
        try {
            t.release();
            objectQueue.offer(t);
        }catch(Exception e) {
            System.out.println("error while releasing the object");
        }
       
    }
    
    
    public int getAvailableConnection() {
        return objectQueue.size();
    }
}
