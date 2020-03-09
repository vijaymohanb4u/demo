package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static final Logger LOGGER= LoggerFactory.getLogger("demolog");
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		LOGGER.info("Simple log ********************************************************************************************statement with inputs {}, {} and {}", 1,2,3);
	}

}
