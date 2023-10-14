package com.exe.productsmappers.persistance.repositories;

import com.exe.productsmappers.persistance.entities.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
