package com.dinuras.AllocationService.controller;

import com.dinuras.AllocationService.Service.AllocationService;
import com.dinuras.AllocationService.model.Allocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allocationServices")
public class AllocationController {

    @Autowired
    AllocationService allocationService;


    @RequestMapping("/allocatorHello")
    public String hello(){
        return "Hello from Allocator";
    }

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

    @RequestMapping("/getByEmp/{id}")
    List<Allocation> getAllocationByEmployee(@PathVariable Integer id) {

        List<Allocation> allocations= allocationService.getAllocationByEmployee(id);
        return allocations;
    }

    //void delete(Integer id);
}