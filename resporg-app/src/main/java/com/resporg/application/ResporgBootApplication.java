package com.resporg.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.resporg"})
public class ResporgBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResporgBootApplication.class, args);
	}

}
