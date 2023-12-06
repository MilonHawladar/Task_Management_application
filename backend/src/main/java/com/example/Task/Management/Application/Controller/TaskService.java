package com.example.Task.Management.Application.Controller;

import com.example.Task.Management.Application.Model.Task;

public enum TaskService {
    ;

    public Task createTask(Task task) {
        return task;
    }

    public Task getTaskById(Long taskId) {
        return null;
    }

    public Task updateTask(Long taskId, Task task) {
        return task;
    }

    public void deleteTask(Long taskId) {
    }
}
