package com.example.Task.task;
import com.example.Task.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        String test = String.valueOf(task);
        return taskService.createTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Long id) {
        return taskService.getTaskById(id);
    }


    @PutMapping("/{id}")
    public Task updateTask(@PathVariable("id") Long id, @RequestBody Task updatedTask) {
        updatedTask.setId(id);
        return taskService.updateTask(updatedTask);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
    }
}
