package com.example.lufthavnsprojekt.Services;

import com.example.lufthavnsprojekt.Models.Plane;
import com.example.lufthavnsprojekt.Models.Task;
import com.example.lufthavnsprojekt.Repositories.TaskRep;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private TaskRep taskRep;

    public TaskService(TaskRep taskRep){
        this.taskRep=taskRep;
    }

    public List<Task> getAllPlanes(){
        List<Task> allTasks = new ArrayList<>();
        taskRep.findAll().forEach(allTasks::add);
        return allTasks;
    }
}
