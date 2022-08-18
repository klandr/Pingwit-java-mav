package com.pingwit.kl.converter;

import com.pingwit.kl.dto.AppleDto;
import com.pingwit.kl.entity.Apple;
import org.springframework.stereotype.Component;

//@Service
//@Component //<--this bin
//Repository

@Component
public class AppleDtoConverter {
    public AppleDto convert (Apple apple){
        return new AppleDto(apple.name(), apple.color(), apple.quantity(), apple.price());
    }

}
