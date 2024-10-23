package com.product.services;

import com.product.models.Product;
import java.util.List;

public interface ProductService {

    Product add(Product product);
    List<Product> getAll();
    Product get(int id);
}
