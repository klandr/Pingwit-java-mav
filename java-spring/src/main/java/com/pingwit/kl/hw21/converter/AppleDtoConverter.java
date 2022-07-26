package com.pingwit.kl.hw21.converter;

import com.pingwit.kl.hw21.dto.AppleDto;
import com.pingwit.kl.hw21.entity.Apple;

//@Component //<--this bean, bean wrote in file config

public class AppleDtoConverter {
    public AppleDto convert (Apple apple){
        return new AppleDto(apple.name(), apple.color(), apple.quantity(), apple.price());
    }

}
