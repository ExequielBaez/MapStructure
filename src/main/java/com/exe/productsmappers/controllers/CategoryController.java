package com.exe.productsmappers.controllers;

import com.exe.productsmappers.dto.CategoryDto;
import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.services.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> getAllCategory(){

        List<CategoryDto> categoryList= categoryService.getAllCategory();

       categoryList.forEach(application -> logger.info(categoryList.toString()));

        return categoryList;
    }
}
