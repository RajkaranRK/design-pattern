package com.rk.dp.creational.builder;

public class Client {
    
    public static void main(String []args) {
        User user = new User.Builder()
                .name("Rajkaran")
                .day(16)
                .month(9)
                .year(1996)
                .build();
        System.out.println(user.toString());
                
    }
}
