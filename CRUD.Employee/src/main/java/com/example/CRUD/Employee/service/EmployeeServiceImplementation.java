package com.example.CRUD.Employee.service;

import com.example.CRUD.Employee.entity.Employee;
import com.example.CRUD.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
    @Autowired
    EmployeeRepository repo;

    public void createNewEmployee(Employee emp) {
        repo.save(emp);
    }

    public void updateEmployee(Employee emp) {
        repo.save(emp);
    }

    public void deleteEmployee(Long id) {
        repo.deleteById(id);
    }

    public Employee searchEmployee(Long id) {
        return repo.findById(id).get();
    }
}
