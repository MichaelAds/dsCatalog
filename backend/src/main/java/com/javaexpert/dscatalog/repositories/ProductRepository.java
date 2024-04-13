package com.javaexpert.dscatalog.repositories;

import com.javaexpert.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
