package com.rk.dp.cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/**
 * reference:
 * https://medium.com/@getrohith.sathya/lru-cache-implementation-using-java-22dd5c218502
 * https://www.geeksforgeeks.org/lru-cache-implementation/
 */
public class LRUCacheImpl {

    /**
     * We use the two data structure i.e. map and linkedlist
     * map will use to access the data using key -> value
     * and linkedlist will use to manage the order of the key
     */
    private Map<Integer,String> data;
    private LinkedList<Integer> order;

    private int capacity;


    public LRUCacheImpl(int capacity){
        this.capacity = capacity;
        data = new HashMap<>();
        order = new LinkedList<>();
    }


    public void put(int key, String value){
        //check if cache is full
        if(order.size() >= capacity){
            //delete last element from order and data from map
            int removedKey = order.removeLast();
            data.remove(removedKey);
        }else{
            order.addFirst(key);
            data.put(key, value);
        }
    }


    public String get(int key){
        String res  = data.get(key);
        if(res != null){
            order.remove(res);
            order.addFirst(key);
        }
        return res;
    }

}
