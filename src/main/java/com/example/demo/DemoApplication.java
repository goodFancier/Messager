package com.example.demo;

import com.example.demo.config.JpaConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {DemoApplication.class, JpaConfig.class}, args);
	}
}
