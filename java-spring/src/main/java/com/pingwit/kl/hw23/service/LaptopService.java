package com.pingwit.kl.hw23.service;

import com.pingwit.kl.hw23.convert.LaptopConverter;
import com.pingwit.kl.hw23.dto.LaptopDto;
import com.pingwit.kl.hw23.entity.Laptop;
import com.pingwit.kl.hw23.repository.LaptopRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    private final LaptopConverter laptopConverter;
    private final LaptopRepository laptopRepository;


    public LaptopService(LaptopConverter laptopConverter, LaptopRepository laptopRepository) {
        this.laptopConverter = laptopConverter;
        this.laptopRepository = laptopRepository;
    }

    /*public long save(LaptopDto laptopDto) {
        Laptop laptop = laptopConverter.toLocal(laptopDto);
        Laptop savedLaptop = laptopRepository.save(laptop);
        return savedLaptop.getId();
    }*/

    public List<LaptopDto> findAll() {
        List<Laptop> laptops = laptopRepository.findAll();
        return laptops.stream().map(laptopConverter::toFront).toList();
    }

    public Page<LaptopDto> findPage(Pageable pageable) {
        return laptopRepository.findAll(pageable).map(laptopConverter::toFront);
    }
}
