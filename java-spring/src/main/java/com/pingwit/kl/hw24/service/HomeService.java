package com.pingwit.kl.hw24.service;

import com.pingwit.kl.hw24.converter.HomeConverter;
import com.pingwit.kl.hw24.dto.HomeDto;
import com.pingwit.kl.hw24.repository.HomeRepository;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    private final HomeRepository repository;
    private final HomeConverter converter;

    public HomeService(HomeRepository repository, HomeConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }
    public Long save(HomeDto dto){
        return repository.save(converter.toLocal(dto)).getId();
    }

//    public List<HomeDto> findAllByHomeType(HomeType type){
//        repository.findAllByHomeType(type).stream().map()
//    }
}
