package com.pingwit.kl.converter;

import com.pingwit.kl.dto.AppleDto;
import com.pingwit.kl.entity.Apple;

//@Service
//@Component //<--this bin
//Repository


public class AppleDtoConverter {
    public AppleDto convert (Apple apple){
        return new AppleDto(apple.name(), apple.color(), apple.quantity(), apple.price());
    }

}
