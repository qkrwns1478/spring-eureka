package com.sparta.resilience4j.sample.controller;

import com.sparta.resilience4j.sample.entity.Product;
import com.sparta.resilience4j.sample.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        return productService.getProductDetails(id);
    }
}