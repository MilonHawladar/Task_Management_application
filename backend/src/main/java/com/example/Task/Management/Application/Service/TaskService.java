package com.example.Task.Management.Application.Service;

import com.example.Task.Management.Application.Model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask(Task task) {
        // Perform any necessary business logic before saving the task
        return taskRepository.save(task);
    }

    public Task getTaskById(Long taskId) {
        return (Task) taskRepository.findById(taskId).orElse(null);
    }

    public Task updateTask(Long taskId, Task updatedTask) {
        // Retrieve the existing task by ID
        Optional<Object> optionalTask = taskRepository.findById(taskId);

        if (optionalTask.isPresent()) {
            Task existingTask = (Task) optionalTask.get();

            // Update the properties of the existing task
            existingTask.setTaskName(updatedTask.getTaskName());
            existingTask.setDescription(updatedTask.getDescription());
            existingTask.setDueDate(updatedTask.getDueDate());
            existingTask.setStatus(updatedTask.getStatus());
            existingTask.setUser(updatedTask.getUser());
            existingTask.setCategory(updatedTask.getCategory());

            // Save the updated task
            return taskRepository.save(existingTask);
        } else {
            return null;  // Task not found
        }
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Additional business logic methods for tasks can be added here

}


