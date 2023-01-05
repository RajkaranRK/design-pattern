package com.rk.dp.solid.s;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private UserRepository userRepository;
    
    private UserValidator userValidator;
    
    public UserService(UserRepository userRepository, UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }
    
    public boolean createUser(User user) {
        if(userValidator.isValid(user)) {
            userRepository.save(user);
            return true;
        }
        return false;
    }
    

}
