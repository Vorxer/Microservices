package com.dinuras.AllocationService.Service;

import com.dinuras.AllocationService.Repository.AllocationRepository;
import com.dinuras.AllocationService.model.Allocation;
//import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;

@Service
public class AllocationServiceImpl implements  AllocationService {


    @Autowired
    AllocationRepository repository;

    @Override
    public List<Allocation> getAllocation() {

        return repository.findAll();

    }

    @Override
    public Allocation getAllocationById(int id) {
        Optional<Allocation> employee = repository.findById(id);

        return employee.orElse(null);

    }

    @Override
    public Allocation add(Allocation allocation) {

        return repository.save(allocation);

    }

    @Override
    public List<Allocation> getAllocationByEmployee(int id) {

        Allocation reference= new Allocation();

        reference.setEmployeeId(id);

        Example<Allocation> exampleAllocation = Example.of(reference);

        Optional<Allocation> example= Optional.of(reference);

        List<Allocation> searchResult = repository.findAll(exampleAllocation);

        return searchResult;

    }

    @Override
    public void delete(Integer id) {

        repository.deleteById(id);

    }





}
