package com.exe.productsmappers.mapper;

import com.exe.productsmappers.dto.ProductDto;
import com.exe.productsmappers.persistance.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    @Mapping(source = "idProduct", target = "idProduct")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "creationDate", target = "creationDate", dateFormat = "yyyy-MM-dd HH-mm-ss")
    ProductDto toGetDTO(ProductEntity productEntity);

    @InheritInverseConfiguration
    ProductEntity toGetEntity(ProductDto productDto);

    List<ProductDto> toGetProductDTOList(List<ProductEntity> productEntityList);

    List<ProductEntity> toGetProductEntityList(List<ProductDto> productDtoList);
}
