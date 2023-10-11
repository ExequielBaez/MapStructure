package com.exe.productsmappers.services;

import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.mapper.ProductMapper;
import com.exe.productsmappers.persistance.entities.ProductEntity;
import com.exe.productsmappers.persistance.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<ProductDto> getAllProducts() {

        List<ProductEntity> listProductsEntity = productRepository.findAll();
        return productMapper.toGetProductDTOList(listProductsEntity);

    }
}
