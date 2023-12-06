package com.example.Task.Management.Application.Service;

import com.example.Task.Management.Application.Model.Task;

import java.util.List;
import java.util.Optional;

public enum TaskRepository {
    ;

    public Task save(Task task) {
        return task;
    }

    public Optional<Object> findById(Long taskId) {
        return null;
    }

    public void deleteById(Long taskId) {
    }

    public List<Task> findAll() {
        return null;
    }
}
