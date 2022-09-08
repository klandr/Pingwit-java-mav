package com.pingwit.kl.hw22.service;

import com.pingwit.kl.hw22.dto.EmailDto;
import com.pingwit.kl.hw22.property.PingwitEmailPropertyRecord;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class PingwitEmailService {
    private final JavaMailSender mailSender;
    private final PingwitEmailPropertyRecord pingwitEmailPropertyRecord;


    public PingwitEmailService(JavaMailSender mailSender,PingwitEmailPropertyRecord pingwitEmailPropertyRecord) {

        this.mailSender = mailSender;
        this.pingwitEmailPropertyRecord = pingwitEmailPropertyRecord;
    }

    public boolean send(EmailDto emailDto) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom(pingwitEmailPropertyRecord.from());
            message.setTo(emailDto.to());
            message.setSubject(emailDto.subject());
            message.setText(emailDto.text() + "\n" + pingwitEmailPropertyRecord.signature());//+ pingwitEmailPropertyRecord.signature()

            mailSender.send(message);
        } catch (Exception e) {
            System.out.println("Error while sending email"+ e.getMessage());
            return false;
        }
        return true;
    }
}
