package com.example.minitest.service.impl;

import com.example.minitest.model.Category;
import com.example.minitest.repository.ICategoryRepository;
import com.example.minitest.service.ICategoryService;
import com.example.minitest.service.core.IGerneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void remove(Long id) {

    }
}
