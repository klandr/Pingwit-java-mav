package com.pingwit.kl.hw21.config;

import com.pingwit.kl.hw21.converter.AppleDtoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AppleDtoConverter appleDtoConverter(){
        return new AppleDtoConverter();
    }
}
