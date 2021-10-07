package com.example.lufthavnsprojekt.Repositories;

import com.example.lufthavnsprojekt.Models.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

public interface PlaneRep extends CrudRepository<Plane, Long> {

}
