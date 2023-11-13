package com.example.springjenkinsintegration;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
