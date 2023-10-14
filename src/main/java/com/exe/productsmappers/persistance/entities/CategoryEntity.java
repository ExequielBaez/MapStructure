package com.exe.productsmappers.persistance.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
public class CategoryEntity {

    @Id
    private Long idCategory;

    private String name;

    private boolean status;


}
