package com.example.Task.Management.Application.Controller;

import com.example.Task.Management.Application.Model.User;

public enum UserService {
    ;

    public User createUser(User user) {
        return user;
    }

    public User getUserById(Long userId) {
        return null;
    }

    public User updateUser(Long userId, User user) {
        return user;
    }

    public void deleteUser(Long userId) {
    }
}
