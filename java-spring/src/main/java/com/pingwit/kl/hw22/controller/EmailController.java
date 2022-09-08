package com.pingwit.kl.hw22.controller;

import com.pingwit.kl.hw22.dto.EmailDto;
import com.pingwit.kl.hw22.service.PingwitEmailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {
    //System.out.println();
    private final PingwitEmailService emailService;

    public EmailController(PingwitEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public boolean sendEmail(@RequestBody EmailDto emailDto){
            return emailService.send(emailDto);
    }


//    @GetMapping("/name")
//    public String getMailName(){
//        return serverService.getName();
}
