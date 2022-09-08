package com.pingwit.kl.hw24.controller;

import com.pingwit.kl.hw24.dto.HomeDto;
import com.pingwit.kl.hw24.service.HomeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
