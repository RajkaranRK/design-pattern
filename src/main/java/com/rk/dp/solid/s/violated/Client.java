package com.rk.dp.solid.s.violated;

import com.rk.dp.solid.s.User;

public class Client {
    
    public static void main(String []args) {
        UserController controller = new UserController();
        System.out.println(controller.createUser(null));
        System.out.println(controller.createUser(User.builder().age(10).email("rk1@gmail.com").name("Rajkaran").build()));
    }

}
