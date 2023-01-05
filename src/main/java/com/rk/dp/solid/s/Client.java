package com.rk.dp.solid.s;

public class Client {
    
    public static void main(String []args) {
        UserRepository userRepository = new UserRepository();
        UserValidator userValidator = new UserValidator();
        UserService userService = new UserService(userRepository,userValidator);
        UserController userController = new UserController(userService);
        System.out.println(userController.createUser(null));
        System.out.println(userController.createUser(User.builder().age(10).email("rk1@gmail.com").name("Rajkaran").build()));
    }

}
