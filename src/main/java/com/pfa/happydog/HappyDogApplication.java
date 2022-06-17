package com.pfa.happydog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HappyDogApplication {

	public static void main(String[] args) {
		/** @param SpringApplication.run initialize the container and return it as a
		 * @param ConfigurableApplicationContext */
		SpringApplication.run(HappyDogApplication.class, args);
	}

}
