package com.example.Task.Management.Application.Repository;

import com.example.Task.Management.Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Define custom query methods if needed
}

