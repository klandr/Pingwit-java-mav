package com.pingwit.kl.hw29.repeatClasswork.controller;

import com.pingwit.kl.hw29.repeatClasswork.dto.CoffeeDto;
import com.pingwit.kl.hw29.repeatClasswork.model.Coffee;
import com.pingwit.kl.hw29.repeatClasswork.service.CoffeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coffee")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeService) {
        this.coffeeService = coffeService;
    }
    @PostMapping("/order")
    public String orderCoffee(@RequestBody CoffeeDto coffeeDto){
        return coffeeService.orderCoffee(coffeeDto);
    }
    @GetMapping("/order/daily")
    public String daily(){return Coffee.LATTE.name();}
}
