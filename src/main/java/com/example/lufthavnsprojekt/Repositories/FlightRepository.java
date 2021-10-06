package com.example.lufthavnsprojekt.Repositories;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository {

    boolean createFlight(Flight flight);
    boolean deleteFlight(int index);
    boolean updateFlight(int index, Flight flight);
    Flight getFlight(int index);
    List<Flight> getFlight();


}
