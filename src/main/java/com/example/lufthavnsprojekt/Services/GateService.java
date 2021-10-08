package com.example.lufthavnsprojekt.Services;

import com.example.lufthavnsprojekt.Models.Flight;
import com.example.lufthavnsprojekt.Models.Gate;
import com.example.lufthavnsprojekt.Repositories.GateRep;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GateService {

    private GateRep gateRep;

    public GateService(GateRep gateRep){
        this.gateRep = gateRep;
    }

    public List<Gate> getAllGates(){
        List<Gate> allGates = new ArrayList<>();
        gateRep.findAll().forEach(allGates::add);
        return allGates;
    }
}
