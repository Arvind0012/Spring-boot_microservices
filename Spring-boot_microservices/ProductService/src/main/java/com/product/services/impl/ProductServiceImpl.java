package com.product.services.impl;

import com.product.models.Product;
import com.product.repositories.ProductRepository;
import com.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public Product add(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return repository.findAll();
    }

    @Override
    public Product get(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
