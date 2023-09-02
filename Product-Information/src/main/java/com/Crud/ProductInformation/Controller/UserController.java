package com.Crud.ProductInformation.Controller;

import com.Crud.ProductInformation.Entity.Product;

import com.Crud.ProductInformation.Entity.User;
import com.Crud.ProductInformation.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService service2;



    //@PostMapping(value="/addproduct", consumes={MediaType.APPLICATION_JSON_UTF8_VALUE} )
    @PostMapping("/adduser")

    public User addUser(@RequestBody User user) {
        return service2.saveUser(user);
    }
     @GetMapping("/finduser/{id}")

    public User findUserById(@PathVariable int u_id) {
        return service2.getUser(u_id);
    }


}
