package com.exe.productsmappers.services;

import com.exe.productsmappers.dto.CategoryDto;
import com.exe.productsmappers.mapper.CategoryMapper;
import com.exe.productsmappers.persistance.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDto> getAllCategory() {

        var allCategories = categoryRepository.findAll();

        return categoryMapper.toGetlistCategoryDto(allCategories);
    }
}
