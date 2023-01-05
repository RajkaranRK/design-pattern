package com.rk.dp.solid.s;

import org.springframework.util.StringUtils;

public class UserValidator {
    
    public boolean isValid(User user) {
        return user != null && user.getAge() > 0 && StringUtils.hasText(user.getName()) && StringUtils.hasText(user.getEmail());
    }

}
