package com.example.lufthavnsprojekt.Controllers;

import com.example.lufthavnsprojekt.Models.Flight;
import com.example.lufthavnsprojekt.Models.Task;
import com.example.lufthavnsprojekt.Services.FlightsService;
import com.example.lufthavnsprojekt.Services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TaskController {

    private TaskService tasksService;

    @GetMapping("/your-tasks")
    public ResponseEntity<List<Task>> FindAllTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(tasksService.getAllTasks());
    }
}
