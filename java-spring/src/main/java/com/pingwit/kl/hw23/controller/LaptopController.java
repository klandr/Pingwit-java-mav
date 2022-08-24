package com.pingwit.kl.hw23.controller;

import com.pingwit.kl.hw23.dto.LaptopDto;
import com.pingwit.kl.hw23.service.LaptopService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    private final LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    /*@PostMapping("/save")
    public long save(@RequestBody LaptopDto laptopDto) {
        return laptopService.save(laptopDto);
    }*/

    @GetMapping("/all")
    public List<LaptopDto> findAll() {
        return laptopService.findAll();
    }

    @GetMapping("/all/page")// /all/page?size=1&page=0
    public Page<LaptopDto> findPage(@RequestParam int page, @RequestParam int size) {
        return laptopService.findPage(PageRequest.of(page, size));
    }
}
