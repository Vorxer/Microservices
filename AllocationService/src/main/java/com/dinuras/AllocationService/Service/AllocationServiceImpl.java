package com.dinuras.AllocationService.Service;

import com.dinuras.AllocationService.Repository.AllocationRepository;
import com.dinuras.AllocationService.model.Allocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.web.client.RestTemplate;

@Service
public class AllocationServiceImpl implements  AllocationService {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }


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
    public List<Allocation> getAllocationByEmployee(Integer id) {

        Allocation reference= new Allocation();

        reference.setEmployeeId(id);

        Example<Allocation> exampleAllocation = Example.of(reference);

        List<Allocation> searchResult = repository.findAll(exampleAllocation);

        System.out.println(searchResult);
        return searchResult;

    }


}
