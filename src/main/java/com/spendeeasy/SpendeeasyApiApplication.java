package com.spendeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.spendeeasy")
@EnableJpaRepositories(basePackages = "com.spendeeasy.repository")
public class SpendeeasyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpendeeasyApiApplication.class, args);
	}

}
