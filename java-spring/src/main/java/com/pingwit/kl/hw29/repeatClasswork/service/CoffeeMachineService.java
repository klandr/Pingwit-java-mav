package com.pingwit.kl.hw29.repeatClasswork.service;


import com.pingwit.kl.hw29.repeatClasswork.model.Coffee;
import org.springframework.stereotype.Component;


@Component
public class CoffeeMachineService {
    public String makeCoffee(Coffee coffee, Integer volume, Boolean sugar){
        return volume + "ml" + coffee+ " " + sugar(sugar);
    }

    private String sugar(Boolean sugar) {
        if (sugar){
            return "with sugar";
        } else {
            return "without sugar";
        }
    }

}
