package com.exe.productsmappers.services;

import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.mapper.ProductMapper;
import com.exe.productsmappers.persistance.entities.ImageEntity;
import com.exe.productsmappers.persistance.entities.ProductEntity;
import com.exe.productsmappers.persistance.repositories.ImageRepository;
import com.exe.productsmappers.persistance.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ImageRepository imageRepository;

    @Override
    public List<ProductDto> getAllProducts() {

        List<ProductEntity> listProductsEntity = productRepository.findAll();
        for (ProductEntity p : listProductsEntity) {
            System.out.println("Dato: " + p);

        }

        return productMapper.toGetProductDTOList(listProductsEntity);

    }

    @Override
    public ProductDto getProduct(Long idProduct) {

        return productMapper.toGetDTO(productRepository.findById(idProduct).get());
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {

        productRepository.save(productMapper.toGetEntity(productDto));

        return productDto;
    }

    @Override
    public void addImage(Long idProduct, MultipartFile file) {
        ProductEntity productEntity = productRepository.findById(idProduct).orElse(null);
        ImageEntity photo = new ImageEntity();
        try {
            photo.setDataImage(file.getBytes());
            imageRepository.save(photo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        productEntity.setImageEntity(photo);
        productRepository.save(productEntity);
    }
}