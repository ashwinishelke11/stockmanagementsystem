package com.project.stockmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.stockmanagementsystem")
public class StockmanagementsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockmanagementsystemApplication.class, args);
	}

}
