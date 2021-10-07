package com.example.lufthavnsprojekt.Repositories;

import com.example.lufthavnsprojekt.Models.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRep extends CrudRepository<Task, Long> {

}
