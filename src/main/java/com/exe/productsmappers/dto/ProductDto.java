package com.exe.productsmappers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductDto {
    private Long idProduct;
    private String name;
    private LocalDateTime creationDate;
    private String origen;
    private String price;

    private CategoryDto categoryDto;



}
