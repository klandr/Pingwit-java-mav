package com.pingwit.kl.hw23.dto;

import com.pingwit.kl.hw23.entity.Processor;
import com.pingwit.kl.hw23.entity.Producer;

import java.math.BigDecimal;

public record LaptopDto(Long id, Producer producer, Processor processor, BigDecimal price) {

}
