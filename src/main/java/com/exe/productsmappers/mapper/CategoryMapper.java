package com.exe.productsmappers.mapper;

import com.exe.productsmappers.dto.CategoryDto;
import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.persistance.entities.CategoryEntity;
import com.exe.productsmappers.persistance.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {

    CategoryDto toGetDto(CategoryEntity categoryEntity);

    @InheritInverseConfiguration
    CategoryEntity toGetEntity(CategoryDto categoryDto);

    List<CategoryDto> toGetlistCategoryDto(List<CategoryEntity> categoryEntityList);

    List<CategoryEntity> toGetListCategoryEntity(List<CategoryDto> categoryDtoList);

}
