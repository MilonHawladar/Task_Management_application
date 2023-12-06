package com.example.Task.Management.Application.Service;

import com.example.Task.Management.Application.Model.User;

import java.util.List;
import java.util.Optional;

public enum UserRepository {
    ;

    public User save(User user) {
        return user;
    }

    public Optional<User> findById(Long userId) {
        return null;
    }

    public void deleteById(Long userId) {
    }

    public List<User> findAll() {
        return null;
    }
}
