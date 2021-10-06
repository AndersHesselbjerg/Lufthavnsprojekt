package com.example.lufthavnsprojekt.Repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirPlaneRepository{

        boolean createAirplane(AirPlane airPlane);
        boolean deleteAirplane(int index);
        boolean updateAirplane(int index, AirPlane airPlane);
        AirPlane getPlane(int index);
        List<AirPlane> getAirplane();

}
