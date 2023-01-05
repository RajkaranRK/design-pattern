package com.rk.dp.solid.s.violated;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import com.rk.dp.solid.s.User;


/***
 * As this Class i.e. UserController violating the Single responsibility principle 
 * currently this class is doing multiple work i.e. validating and saving the user., 
 * whereas a controller class should be 
 * responsible for taking the request and forwarding to rest of the application it shouldn't perform any business logic in it. 
 * @author a13400388
 *
 */
@RestController
public class UserController {
   
    private Map<String, User> store = new HashMap<>();
    
    public ResponseEntity<Object> createUser(User user){
        if(isValidUser(user)) {
            store.put(user.getEmail(), user);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @SuppressWarnings("deprecation")
    public boolean isValidUser(User user) {
        return user != null && user.getAge() > 0 && !StringUtils.isEmpty(user.getName()) && !StringUtils.isEmpty(user.getEmail());
    }
}
