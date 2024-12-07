package com.example.todo.controller;

import com.example.todo.model.Task;
import com.example.todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend to communicate
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // CRUD operations
    // Read - Get All Tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Create - Add a New Task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        task.setId(UUID.randomUUID().toString().split("-")[0]);
        return taskRepository.save(task);
    }

    // Update a Task
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable String id, @RequestBody Task updatedTask) {
        return taskRepository.findById(id).map(task -> {
            task.setText(updatedTask.getText());
            task.setCompleted(updatedTask.isCompleted());
            return taskRepository.save(task);
        }).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    // Delete a Task
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskRepository.deleteById(id);
    }
}
