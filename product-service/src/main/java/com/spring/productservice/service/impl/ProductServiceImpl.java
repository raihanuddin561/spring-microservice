package com.spring.productservice.service.impl;

import com.spring.productservice.dto.ProductRequestModel;
import com.spring.productservice.dto.ProductResponseModel;
import com.spring.productservice.entity.Product;
import com.spring.productservice.repository.ProductRepository;
import com.spring.productservice.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public ProductResponseModel createProduct(ProductRequestModel productRequestModel) {
        ModelMapper modelMapper = new ModelMapper();
        Product product = modelMapper.map(productRequestModel,Product.class);
        Product storedProduct=productRepository.save(product);
        return modelMapper.map(storedProduct,ProductResponseModel.class);
    }
}
