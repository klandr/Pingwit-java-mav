package com.pingwit.kl.hw24.dto;

import com.pingwit.kl.hw24.entity.HomeType;

public record HomeDto (long id, HomeType homeType, Integer floorNumber, Integer entranceNumber){
}
