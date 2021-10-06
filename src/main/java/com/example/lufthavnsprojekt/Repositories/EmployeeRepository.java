package com.example.lufthavnsprojekt.Repositories;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface EmployeeRepository {

    boolean createEmployee(Employee employee);
    boolean deleteEmployee(int index);
    boolean updateEmployee(Employee employee);
    Employee getEmployee(int index);


}
