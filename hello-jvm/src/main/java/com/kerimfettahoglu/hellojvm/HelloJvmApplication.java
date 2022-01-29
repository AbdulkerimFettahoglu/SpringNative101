package com.kerimfettahoglu.hellojvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloJvmApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello from JVM World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloJvmApplication.class, args);
	}

}
