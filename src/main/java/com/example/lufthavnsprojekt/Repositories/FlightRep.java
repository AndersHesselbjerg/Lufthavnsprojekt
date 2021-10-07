package com.example.lufthavnsprojekt.Repositories;


import com.example.lufthavnsprojekt.Models.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRep extends CrudRepository<Flight, Long> {
}
