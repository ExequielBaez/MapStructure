package com.exe.productsmappers.controllers;

import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDto> getAllProducts(){

        var productList= productService.getAllProducts();

        productList.forEach(application -> logger.info(productList.toString()));

        return productList;
    }

    @GetMapping("/{idProduct}")
    public ProductDto getProduct(@PathVariable Long idProduct){

        return productService.getProduct(idProduct);
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto){
        logger.info("Product to create: " +productDto);
        productService.createProduct(productDto);
        return ResponseEntity.status(CREATED).build();

    }

    @PostMapping("/upload")
    public ResponseEntity<?> uploadImage(@RequestPart("file") MultipartFile file,
                            @RequestParam("idProduct") Long idProduct){
        Map<String, Object> response = new HashMap<>();
        productService.addImage(idProduct, file);

        return new ResponseEntity<Map<String, Object>>(response, CREATED);
    }




}
