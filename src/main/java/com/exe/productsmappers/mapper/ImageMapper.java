package com.exe.productsmappers.mapper;

import com.exe.productsmappers.dto.ImageDto;
import com.exe.productsmappers.persistance.entities.ImageEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ImageMapper {

    ImageDto getImageDto(ImageEntity imageEntity);

    @InheritInverseConfiguration
    ImageEntity getImageEntity(ImageDto imageDto);
}
