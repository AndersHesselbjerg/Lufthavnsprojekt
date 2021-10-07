package com.example.lufthavnsprojekt.Repositories;

import com.example.lufthavnsprojekt.Models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRep extends CrudRepository<Employee, Long> {

}



