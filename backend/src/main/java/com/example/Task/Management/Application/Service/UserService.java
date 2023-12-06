package com.example.Task.Management.Application.Service;

import com.example.Task.Management.Application.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        // Perform any necessary business logic before saving the user
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return (User) userRepository.findById(userId).orElse(null);
    }

    public User updateUser(Long userId, User updatedUser) {
        // Retrieve the existing user by ID
        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();

            // Update the properties of the existing user
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPassword(updatedUser.getPassword());

            // Save the updated user
            return userRepository.save(existingUser);
        } else {
            return null;  // User not found
        }
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Additional business logic methods for users can be added here

}

