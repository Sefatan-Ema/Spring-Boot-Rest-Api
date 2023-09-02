package com.Crud.ProductInformation.Service;

import com.Crud.ProductInformation.Entity.Product;
import com.Crud.ProductInformation.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    //post mathod
    //create product by id

    public Product saveProduct(Product product) {
        return repository.save(product);

    }
    //create a list of product
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);

    }

    //get mathod
    //find by id
    public Product getProduct(int id) {
        return repository.findById(id).orElse(null);

    }
    public Product getProduct(String name) {
        return repository.findByName(name);

    }
    //find a list of product
    public List<Product> getProducts() {
        return repository.findAll();
    }

    //delete mathod
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "Product removed with id" +id;

    }
    //update mathod
    public Product updateProduct(int id,Product product){
        Product data= repository.findById(id).orElse(null);
        data.setName(product.getName());
        data.setQuantity(product.getQuantity());
        data.setPrice(product.getPrice());
        return repository.save(data);
    }


}