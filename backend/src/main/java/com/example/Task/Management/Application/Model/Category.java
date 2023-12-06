package com.example.Task.Management.Application.Model;

public class Category {
    private Long id;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String categoryName;

    // Getters and setters
}

