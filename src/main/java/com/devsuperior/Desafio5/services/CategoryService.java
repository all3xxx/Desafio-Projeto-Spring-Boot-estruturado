package com.devsuperior.Desafio5.services;

import com.devsuperior.Desafio5.dto.CategoryDTO;
import com.devsuperior.Desafio5.entities.Category;
import com.devsuperior.Desafio5.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(category -> new CategoryDTO(category)).toList();
    }

}
