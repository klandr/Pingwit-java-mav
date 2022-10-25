package com.pingwit.kl.hw29.repeatClasswork.service;

import com.pingwit.kl.hw29.repeatClasswork.dto.CoffeeDto;
import org.springframework.stereotype.Service;

@Service
public class CoffeeService {
    private final CoffeeMachineService coffeeMachineService;

    public CoffeeService(CoffeeMachineService coffeeMachineService) {
        this.coffeeMachineService = coffeeMachineService;
    }

    public String orderCoffee(CoffeeDto dto){
        return coffeeMachineService.makeCoffee(dto.coffee(), dto.volume(), dto.sugar());
    }
}
