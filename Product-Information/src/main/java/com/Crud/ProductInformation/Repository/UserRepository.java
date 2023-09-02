package com.Crud.ProductInformation.Repository;


import com.Crud.ProductInformation.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>

    {

    }


