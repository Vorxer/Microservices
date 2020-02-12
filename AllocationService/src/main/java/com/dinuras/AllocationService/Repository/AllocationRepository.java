package com.dinuras.AllocationService.Repository;

import com.dinuras.AllocationService.model.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation,Integer> {
}
