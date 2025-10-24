package com.example.CRUD.Employee.controller;

import com.example.CRUD.Employee.entity.Employee;
import com.example.CRUD.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/createPage")
    public String createPage() {
        return "create";
    }

    @PostMapping("/create")
    public void newEmployee(Employee emp) {
        service.createNewEmployee(emp);
    }

    @GetMapping("/updatePage")
    public String updatePage() {
        return "update";
    }

    @PostMapping("/update")
    public void uEmployee(Employee emp) {
        service.updateEmployee(emp);
    }

    @GetMapping("/deletePage")
    public String deletePage() {
        return "delete";
    }

    @GetMapping("/delete")
    public void dEmployee(Long id) {
        service.deleteEmployee(id);
    }

    @GetMapping("/searchPage")
    public String searchPage() {
        return "search";
    }

    @GetMapping("/search")
    public String sEmployee(Long id, Model model) {
        Employee emp =  service.searchEmployee(id);
        model.addAttribute("empObject", emp);
        return "searchResult";
    }

    @GetMapping("/viewAllPage")
    public String getAllEmployee(Model model) {
        List<Employee> empList = service.getAllEmployees();
        model.addAttribute("empList", empList);
        return "viewAll";
    }
}
