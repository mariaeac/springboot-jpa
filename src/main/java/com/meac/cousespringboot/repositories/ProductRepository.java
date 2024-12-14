package com.meac.cousespringboot.repositories;

import com.meac.cousespringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
