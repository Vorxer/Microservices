package com.dinuras.AllocationService.model;

import javax.persistence.*;

@Entity
public class Allocation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer employeeId;
    String ProjectCode;
    String Project_Details;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
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
