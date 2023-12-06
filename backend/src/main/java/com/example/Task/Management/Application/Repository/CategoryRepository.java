package com.example.Task.Management.Application.Repository;


import com.example.Task.Management.Application.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Define custom query methods if needed
}

