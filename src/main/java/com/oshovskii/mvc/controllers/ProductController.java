package com.oshovskii.mvc.controllers;


import com.oshovskii.mvc.entity.Product;
import com.oshovskii.mvc.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> findAllProducts(){
        return productService.findAll();

    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Long id) {
        return productService.findProductById(id).orElseThrow(() -> new RuntimeException("Product with id: " + id + " doens't exist"));
    }
}
