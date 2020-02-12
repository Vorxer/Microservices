package com.dinuras.EmployeeService.controller;

import com.dinuras.EmployeeService.Service.EmployeeService;
import com.dinuras.EmployeeService.model.Employee;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/employeeServices")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee/{id}")
    public Employee getByID(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @RequestMapping("/add")
    public Employee getAllEmployees(@RequestBody Employee employee){
        return employeeService.add(employee);
    }
}