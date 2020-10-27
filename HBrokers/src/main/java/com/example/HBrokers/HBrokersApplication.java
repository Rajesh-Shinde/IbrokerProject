package com.example.HBrokers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HBrokersApplication {

	public static void main(String[] args) {
		SpringApplication.run(HBrokersApplication.class, args);
	}
}
