package com.codegym.repository;

import com.codegym.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brand,Long> {
}
