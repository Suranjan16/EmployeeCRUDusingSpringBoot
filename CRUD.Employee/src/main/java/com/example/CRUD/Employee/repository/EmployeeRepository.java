package com.example.CRUD.Employee.repository;

import com.example.CRUD.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
