package com.dinuras.AllocationService.Service;

import com.dinuras.AllocationService.model.Allocation;

import java.util.List;

public interface AllocationService {
    List<Allocation> getAllocation();

    Allocation getAllocationById(int id);

    Allocation add(Allocation allocation);

    List<Allocation> getAllocationByEmployee(Integer id);

}
