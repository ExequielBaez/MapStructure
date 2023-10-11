package com.exe.productsmappers.controllers;

import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;
    @GetMapping
    public List<ProductDto> getAllProducts(){

        List<ProductDto> productList= productService.getAllProducts();

        productList.forEach(application -> logger.info(productList.toString()));

        return productList;

    }



}
