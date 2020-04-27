package com.roytuts.spring.activiti.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration(exclude = { org.activiti.spring.boot.SecurityAutoConfiguration.class })
@SpringBootApplication(scanBasePackages = "com.roytuts.spring.activiti.integration")
public class SpringActivitiApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringActivitiApp.class, args);
	}

}
