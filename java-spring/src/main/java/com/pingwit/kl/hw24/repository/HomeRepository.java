package com.pingwit.kl.hw24.repository;

import com.pingwit.kl.hw24.entity.Home;
import com.pingwit.kl.hw24.entity.HomeType;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface HomeRepository extends PagingAndSortingRepository<Home,Long> {
    List<Home> findAllByHomeType(HomeType homeType);
}
