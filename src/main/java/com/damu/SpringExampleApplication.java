package com.damu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringExampleApplication {
	private final static Logger LOGGER = LoggerFactory.getLogger(SpringExampleApplication.class);

	public static void main(String[] args) {

		LOGGER.info("Before Starting of main method");
		SpringApplication.run(SpringExampleApplication.class, args);
		LOGGER.info("After Starting of main method");
	}
	@GetMapping("/message")
	public String getWelcome()
	{
		return "Hello World";
	}

}
