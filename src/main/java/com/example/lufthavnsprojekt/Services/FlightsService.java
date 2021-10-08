package com.example.lufthavnsprojekt.Services;

import com.example.lufthavnsprojekt.Models.Flight;
import com.example.lufthavnsprojekt.Models.Plane;
import com.example.lufthavnsprojekt.Repositories.FlightRep;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightsService {

    private FlightRep flightRep;

    public FlightsService(FlightRep flightRep){
        this.flightRep = flightRep;
    }

    public List<Flight> getAllFlights(){
        List<Flight> allFlights = new ArrayList<>();
        flightRep.findAll().forEach(allFlights::add);
        return allFlights;
    }
}
