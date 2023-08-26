package com.springboot.springbootessentials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.springbootessentials")
public class SpringBootEssentialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEssentialsApplication.class, args);
	}

}
