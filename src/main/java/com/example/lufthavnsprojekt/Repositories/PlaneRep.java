package com.example.lufthavnsprojekt.Repositories;

import com.example.lufthavnsprojekt.Models.Plane;
import org.springframework.data.repository.CrudRepository;

public interface PlaneRep extends CrudRepository<Plane, Long> {
    Plane findPlaneById(Long id);
}
