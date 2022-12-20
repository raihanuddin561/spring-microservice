package com.spring.productservice.controller;

import com.spring.productservice.dto.ProductRequestModel;
import com.spring.productservice.dto.ProductResponseModel;
import com.spring.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponseModel createProduct(@RequestBody ProductRequestModel productRequestModel){
        return productService.createProduct(productRequestModel);
    }
}
