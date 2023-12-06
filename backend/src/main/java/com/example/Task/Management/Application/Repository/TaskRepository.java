package com.example.Task.Management.Application.Repository;

import com.example.Task.Management.Application.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Define custom query methods if needed
}

