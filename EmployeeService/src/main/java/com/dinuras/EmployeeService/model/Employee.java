package com.dinuras.EmployeeService.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ID;

    private String Name;
    private String Location;

    @OneToMany(mappedBy = "employee")
    List<Telephone> telephones;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;


    @ManyToMany(cascade = CascadeType.ALL)
    //@Fetch(value = FetchMode.SELECT)
    @JoinTable(
            name = "EmployeeProjects",
            joinColumns=
            @JoinColumn(name="emp_ID", referencedColumnName="ID"),
            inverseJoinColumns=
            @JoinColumn(name="prj_ID", referencedColumnName="ID")
    )
    List<Project> projects;

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getID() {
        return ID;
    }

    public void setID(int employeeID) {
        ID = employeeID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
