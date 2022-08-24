package com.pingwit.kl.hw23.convert;

import com.pingwit.kl.hw23.dto.LaptopDto;
import com.pingwit.kl.hw23.entity.Laptop;
import org.springframework.stereotype.Component;

@Component
public class LaptopConverter {
    /*public Laptop toLocal(LaptopDto dto) {
        Laptop laptop = new Laptop();

        laptop.setProducer(dto.producer());
        laptop.setProcessor(dto.processor());
        laptop.setPrice(dto.price());
        return laptop;
    }*/

    public LaptopDto toFront(Laptop laptop) {
        return new LaptopDto(laptop.getId(), laptop.getProducer(), laptop.getProcessor(), laptop.getPrice());
    }
}
