package com.pingwit.kl.servise;

//@Service //<--this bin
//@Component
//Repository

import com.pingwit.kl.repository.AppleWarehouse;
import org.springframework.stereotype.Service;

@Service
public class AppleServise {
    private final AppleWarehouse appleWarehouse;

    public AppleServise(AppleWarehouse appleWarehouse) {
        this.appleWarehouse = appleWarehouse;
    }
}
