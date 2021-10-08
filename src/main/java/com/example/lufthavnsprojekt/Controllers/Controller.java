package com.example.lufthavnsprojekt.Controllers;

import com.example.lufthavnsprojekt.Models.Flight;
import com.example.lufthavnsprojekt.Models.Gate;
import com.example.lufthavnsprojekt.Models.Plane;
import com.example.lufthavnsprojekt.Models.Task;
import com.example.lufthavnsprojekt.Services.FlightsService;
import com.example.lufthavnsprojekt.Services.GateService;
import com.example.lufthavnsprojekt.Services.PlaneService;
import com.example.lufthavnsprojekt.Services.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RequestMapping("/airport")
@RestController
public class Controller {


    private PlaneService planeService;
    private TaskService taskService;
    private FlightsService flightsService;
    private GateService gateService;

    public Controller(PlaneService planeService, TaskService taskService, FlightsService flightsService, GateService gateService){
        this.planeService = planeService;
        this.taskService = taskService;
        this.flightsService = flightsService;
        this.gateService = gateService;
    }


    @GetMapping("/planes")
    public ResponseEntity<List<Plane>> findAllPlanes(){
        return ResponseEntity.status(HttpStatus.OK).body(planeService.getAllPlanes());
    }

    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> findAllTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());
    }

    @GetMapping("/flights")
    public ResponseEntity<List<Flight>> FindAllFlights(){
        return ResponseEntity.status(HttpStatus.OK).body(flightsService.getAllFlights());
    }

    @GetMapping("/gates")
    public ResponseEntity<List<Gate>> FindAllGates(){
        return ResponseEntity.status(HttpStatus.OK).body(gateService.getAllGates());
    }

    @GetMapping("/your-tasks")
    public ResponseEntity<List<Task>> FindAllTasks(){
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());
    }
/*
    @GetMapping("/planes/{id}")
    public ResponseEntity<Optional<Plane>> specificPlane(@PathVariable Long id){
        Optional<Plane> onePlane = planeRep.findById(id);
        if (onePlane.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(onePlane);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(onePlane);
        }
    }

 */

}