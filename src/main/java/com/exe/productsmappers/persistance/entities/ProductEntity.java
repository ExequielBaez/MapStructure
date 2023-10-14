package com.exe.productsmappers.persistance.entities;

import jakarta.persistence.*;
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

@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;
    private String name;
    private LocalDateTime creationDate;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private CategoryEntity categoryEntity;

    @OneToOne
    @JoinColumn(name = "id_image")
    private ImageEntity imageEntity;
}
