package com.rk.dp.solid.s;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    Map<String, User> store = new HashMap<>();
    
    public void save(User user) {
        this.store.put(user.getEmail(), user);
    }

}
