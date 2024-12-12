package com.meac.cousespringboot.repositories;

import com.meac.cousespringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
