package com.exe.productsmappers.services;

import com.exe.productsmappers.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {

    public List<ProductDto> getAllProducts();

    public ProductDto getProduct(Long idProduct);

    ProductDto createProduct(ProductDto productDto);

    void addImage(Long idProduct, MultipartFile file);
}
