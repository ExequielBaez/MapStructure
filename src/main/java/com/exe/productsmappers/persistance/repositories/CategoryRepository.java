package com.exe.productsmappers.persistance.repositories;

import com.exe.productsmappers.persistance.entities.CategoryEntity;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
