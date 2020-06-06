package com.example.BootReactStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("com.example.BootReactStarter.controllers")
public class BootReactStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootReactStarterApplication.class, args);
	}

}
