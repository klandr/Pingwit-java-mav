package com.pingwit.kl.hw23.repository;

import com.pingwit.kl.hw23.entity.Laptop;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface LaptopRepository extends PagingAndSortingRepository<Laptop, Long> {
    List<Laptop> findAll();
}
//PagingAndSortingRepository - Maven