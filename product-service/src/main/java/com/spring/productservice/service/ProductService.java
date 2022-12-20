package com.spring.productservice.service;

import com.spring.productservice.dto.ProductRequestModel;
import com.spring.productservice.dto.ProductResponseModel;

public interface ProductService {
    ProductResponseModel createProduct(ProductRequestModel productRequestModel);
}
