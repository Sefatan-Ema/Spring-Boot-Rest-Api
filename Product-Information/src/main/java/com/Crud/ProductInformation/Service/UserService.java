package com.Crud.ProductInformation.Service;

import com.Crud.ProductInformation.Entity.Product;
import com.Crud.ProductInformation.Entity.User;

import com.Crud.ProductInformation.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository2;

    //post mathod
    //create product by id
    public User saveUser(User user) {
        return repository2.save(user);

    }
    public User getUser(int u_id) {
        return repository2.findById(u_id).orElse(null);

    }
}
