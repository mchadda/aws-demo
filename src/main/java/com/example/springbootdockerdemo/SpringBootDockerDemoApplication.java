package com.example.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerDemoApplication {

	@GetMapping("/test")
	public String getDisplay() {
		return "Done";
	}
	
	@GetMapping("/testing")
	public String getDisplayTest() {
		return "Done testing";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerDemoApplication.class, args);
	}

}
