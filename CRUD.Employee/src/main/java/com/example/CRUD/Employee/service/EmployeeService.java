package com.example.CRUD.Employee.service;

import com.example.CRUD.Employee.entity.Employee;

public interface EmployeeService {
    void createNewEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void deleteEmployee(Long id);
    Employee searchEmployee(Long id);
}
