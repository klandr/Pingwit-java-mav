package com.pingwit.kl;

import com.pingwit.kl.hw22.property.EmailProperty;
import com.pingwit.kl.hw22.property.EmailPropertyRecord;
import com.pingwit.kl.hw22.property.PingwitEmailPropertyRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({EmailProperty.class,  EmailPropertyRecord.class, EmailPropertyRecord.class, PingwitEmailPropertyRecord.class })
public class JavaSpringApplication {

//	@Autowired
//	private EmailSenderService senderService; //tutorial from youtube

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)//tutorial from youtube
//	public void sendMail(){
//		senderService.sendEmail("pozand47@gmail.com",
//								"This is subject",
//								"this is body of email");
//	}
}
