package com.dinuras.EmployeeService.Service;

import com.dinuras.EmployeeService.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee add(Employee employee);

    void delete(Integer id);

    List<Employee> getEmployees();

    Employee getEmployeeById(int id);
}
