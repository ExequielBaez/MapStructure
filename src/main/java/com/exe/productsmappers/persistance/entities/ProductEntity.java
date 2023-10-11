package com.exe.productsmappers.persistance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class ProductEntity {
    @Id
    private Long idProduct;
    private String name;
    private LocalDateTime creationDate;

}
