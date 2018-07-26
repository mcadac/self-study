package com.example.master10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class Application {

	@Autowired
	private ExternalProperties externalProperties;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
