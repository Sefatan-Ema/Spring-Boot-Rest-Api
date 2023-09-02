package com.Crud.ProductInformation.Repository;

import com.Crud.ProductInformation.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
Product findByName(String name);
}
