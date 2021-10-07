package com.example.lufthavnsprojekt.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

public interface AirPlaneRepository <Long, Id> extends CrudRepository<Long, Id> {

}
