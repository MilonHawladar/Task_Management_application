package com.example.Task.Management.Application.Service;

import com.example.Task.Management.Application.Model.Category;

import java.util.List;
import java.util.Optional;

public enum CategoryRepository {
    ;

    public <Category> Category save(Category category) {
        return category;
    }

    public Optional<Object> findById(Long categoryId) {
        return null;
    }

    public void deleteById(Long categoryId) {
    }

    public List<Category> findAll() {
        return null;
    }
}
