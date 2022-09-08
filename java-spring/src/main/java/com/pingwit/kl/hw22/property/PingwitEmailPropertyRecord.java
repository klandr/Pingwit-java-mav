package com.pingwit.kl.hw22.property;


import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationPropertiesScan
@ConfigurationProperties(prefix = "ua.email")
public record PingwitEmailPropertyRecord(String from,String signature){
//@Service
//public record PingwitEmailPropertyRecord(@Value("${pingwit.email.from}")String from,@Value("${pingwit.email.signature}") String signature){
}
