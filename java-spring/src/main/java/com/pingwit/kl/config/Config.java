package com.pingwit.kl.config;

import com.pingwit.kl.converter.AppleDtoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public AppleDtoConverter appleDtoConverter(){
        return new AppleDtoConverter();
    }
}
