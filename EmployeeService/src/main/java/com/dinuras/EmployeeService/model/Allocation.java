package com.dinuras.EmployeeService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allocation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int employeeId;
    String ProjectCode;
    String Project_Details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getProjectCode() {
        return ProjectCode;
    }

    public void setProjectCode(String projectCode) {
        ProjectCode = projectCode;
    }

    public String getProject_Details() {
        return Project_Details;
    }

    public void setProject_Details(String project_Details) {
        Project_Details = project_Details;
    }
}
