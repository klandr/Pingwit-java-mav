package com.pingwit.kl.repository;

//@Service
//@Component
//@Repository //<--this bin

import com.pingwit.kl.entity.Apple;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AppleWarehouse {
    private Map<Long, Apple> storage = new HashMap<>();

    @PostConstruct
    private void init(){
        System.out.println("Hi, from PostConstruct!");
        storage.put(1L,new Apple(1L,"Naliv","white ", 75 ,133.5));
        storage.put(2L,new Apple(2L," Golden","red ", 60 , 180D));
        storage.put(3L,new Apple(3L,"pineapple","green ", 40 ,56D));
        storage.put(4L,new Apple(4L,"Prince","green ", 35 ,48D));
        storage.put(5L,new Apple(5L,"Antonovka","green ", 50 ,200D));
        storage.put(6L,new Apple(6L,"Prince","green ", 70 ,70.5));
        storage.put(7L,new Apple(7L,"Golden","red ", 100 ,99D));
        storage.put(8L,new Apple(8L,"Naliv","white ", 75 ,20D));
        storage.put(9L,new Apple(9L,"Naliv","white ", 75 ,18D));
        storage.put(10L,new Apple(10L,"Antonovka","green ", 50 ,15.5D));
        storage.put(11L,new Apple(11L,"Antonovka","green ", 50 ,18D));
        storage.put(12L,new Apple(12L,"Antonovka","green ", 50 ,10D));
    }
}
