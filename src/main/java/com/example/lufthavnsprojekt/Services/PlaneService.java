package com.example.lufthavnsprojekt.Services;

import com.example.lufthavnsprojekt.Models.Plane;
import com.example.lufthavnsprojekt.Repositories.PlaneRep;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class PlaneService {

    private PlaneRep planeRep;

    public PlaneService(PlaneRep planeRep){
        this.planeRep = planeRep;
    }

    public Plane savePlane(Plane plane){
        return planeRep.save(plane);
    }

    public Plane getSpecificPlane(long id){
        return planeRep.findPlaneById(id);
    }

    public List<Plane> getAllPlanes(){
        List<Plane> allPlanes = new ArrayList<>();
        planeRep.findAll().forEach(allPlanes::add);
        return allPlanes;
    }

    /*
    public void makePlane(boolean passengers, boolean isClean, boolean hasGas, Set<Flight> flights, String model, String icao, char size, int gateNo){
        Plane tmp = new Plane(passengers, gateNo, isClean,  hasGas, flights, model, icao, size);
        planeRep.save(tmp);
    }
    public void makePlane(String icao, String model, char size){
        Plane tmp = new Plane(model, icao, size);
        planeRep.save(tmp);
    }
}
 */


}