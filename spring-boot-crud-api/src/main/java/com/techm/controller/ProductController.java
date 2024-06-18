package com.techm.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final List<Product> products = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    // Create a new product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        product.setId(counter.incrementAndGet());
        products.add(product);
        return product;
    }

    // Get a product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return products.stream()
                       .filter(product -> product.getId().equals(id))
                       .findFirst()
                       .orElse(null);
    }

    // Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return products;
    }

    // Update a product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .ifPresent(product -> {
                    product.setName(updatedProduct.getName());
                    product.setPrice(updatedProduct.getPrice());
                });
        return updatedProduct;
    }

    // Delete a product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}

