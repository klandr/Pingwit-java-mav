package com.pingwit.kl.servise;

//@Service //<--this bin
//@Component
//Repository

import com.pingwit.kl.converter.AppleDtoConverter;
import com.pingwit.kl.dto.AppleDto;
import com.pingwit.kl.entity.Apple;
import com.pingwit.kl.repository.AppleWarehouse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppleServise {
    private final AppleWarehouse appleWarehouse;
    private final AppleDtoConverter appleDtoConverter;

    @Autowired
    public AppleServise(AppleWarehouse appleWarehouse, AppleDtoConverter appleDtoConverter) {
        this.appleWarehouse = appleWarehouse;
        this.appleDtoConverter = appleDtoConverter;
    }

    public AppleServise(){
        System.out.println("hi from constructor");
        appleWarehouse = null;
        appleDtoConverter = null;
    }

    public AppleDto getById(Long id){
        Apple apple = appleWarehouse.getById(id);
        return appleDtoConverter.convert(apple);
    }
}
