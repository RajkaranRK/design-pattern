package com.rk.dp.structural.bridge;

public class Client {
    
    public static void main(String []args) {
        LinkedList<Integer> list = new SinglyLinkedList<>();
        FifoCollection<Integer> queue = new Queue<>(list);
        queue.offer(10);
    }

}


/***
 * 
 * In this example both the abstraction i.e. FifoCollection, Queue 
 * and Implementor i.e. LinkedList, SinglyLinkedList and ArrayLinkedList
 * having different hierarchies and both are join using composition
**/
