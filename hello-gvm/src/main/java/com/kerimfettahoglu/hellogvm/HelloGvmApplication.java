package com.kerimfettahoglu.hellogvm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloGvmApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello from GVM World";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloGvmApplication.class, args);
	}

}
