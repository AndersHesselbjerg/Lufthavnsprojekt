package com.example.lufthavnsprojekt.Repositories;


import org.springframework.data.repository.CrudRepository;


public interface GateRepository<Long, Id> extends CrudRepository<Long,Id> {

}
