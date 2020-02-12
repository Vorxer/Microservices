package com.dinuras.AllocationService.controller;

import com.dinuras.AllocationService.Service.AllocationService;
import com.dinuras.AllocationService.model.Allocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/allocationServices")
public class AllocationController {

    @Autowired
    AllocationService allocationService;

    @RequestMapping("/allocations")
    public List<Allocation> getAllAllocations(){
        return allocationService.getAllocation();
    }

    @RequestMapping("/allocation/{id}")
    public Allocation getByID(@PathVariable int id){
        return allocationService.getAllocationById(id);
    }

    @RequestMapping("/add")
    public Allocation getAllAllocations(@RequestBody Allocation allocation){
        return allocationService.add(allocation);
    }

    @RequestMapping("/getByEmp")
    List<Allocation> getAllocationByEmployee(int id) {

        List<Allocation> allocations= allocationService.getAllocationByEmployee(id);
        return allocations;
    }

    //void delete(Integer id);
}