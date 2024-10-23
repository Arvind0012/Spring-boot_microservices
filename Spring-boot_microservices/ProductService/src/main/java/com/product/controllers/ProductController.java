package com.product.controllers;

import com.product.models.Product;
import com.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService services;

    @PostMapping
    public Product Create(@RequestBody Product product){
        return services.add(product);
    }

    @GetMapping
    public List<Product> GetAllProduct(){
        return services.getAll();
    }

    @GetMapping("{id}")
    public Product getProductById(int id){
        return services.get(id);
    }
}
