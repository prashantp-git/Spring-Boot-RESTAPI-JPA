package com.example.springbootrestjpa.service;

import com.example.springbootrestjpa.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);

}
