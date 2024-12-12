package com.meac.cousespringboot.services;


import com.meac.cousespringboot.entities.Category;
import com.meac.cousespringboot.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category findById(Long id) {
        Optional<Category> order = categoryRepository.findById(id);
        return order.get();
    }


}
