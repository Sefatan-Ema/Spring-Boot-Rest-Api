package com.Crud.ProductInformation.Controller;

import com.Crud.ProductInformation.Entity.Product;
import com.Crud.ProductInformation.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService service;



    //@PostMapping(value="/addproduct", consumes={MediaType.APPLICATION_JSON_UTF8_VALUE} )
    @PostMapping("/addproduct")

    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
    @PostMapping("/addproducts")

    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
    @GetMapping("/findproductid/{id}")

    public Product findProductById(@PathVariable int id) {
        return service.getProduct(id);
    }
    @GetMapping("/findproductn/{name}")

    public Product findProductById(@PathVariable String name) {
        return service.getProduct(name);
    }
    @GetMapping("/findproducts")

    public List<Product> findAllProducts() {
        return service.getProducts();
    }

  @PutMapping("/update/{id}")
  public Product updProduct(@PathVariable int id, @RequestBody Product product) {
      return service.updateProduct(id, product);
  }

    @DeleteMapping("/delete/{id}")
    public String delProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}