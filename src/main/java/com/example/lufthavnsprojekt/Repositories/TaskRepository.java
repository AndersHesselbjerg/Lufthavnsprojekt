package com.example.lufthavnsprojekt.Repositories;

import org.springframework.data.repository.CrudRepository;

public interface TaskRepository<Long, Id> extends CrudRepository<Long,Id> {

}
