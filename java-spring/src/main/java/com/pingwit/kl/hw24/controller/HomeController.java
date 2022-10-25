package com.pingwit.kl.hw24.controller;

import com.pingwit.kl.hw24.dto.HomeDto;
import com.pingwit.kl.hw24.service.HomeService;
import com.pingwit.kl.hw24.entity.HomeType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/house")
public class HomeController {
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @PostMapping("/save")
    public long save(@RequestBody HomeDto homeDto){
        return homeService.save(homeDto);
    }

    @GetMapping("/search/type/{houseType}")
    public List<HomeDto> findAllByType(@PathVariable HomeType hometype){
        return homeService.findAllByHomeType(hometype);
    }
}
