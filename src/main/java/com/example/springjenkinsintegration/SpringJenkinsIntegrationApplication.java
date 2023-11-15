package com.example.springjenkinsintegration;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
public class SpringJenkinsIntegrationApplication {

	@PostConstruct
	public void init(){
		log.info("Application started...");
	}

	public static void main(String[] args) {
		log.info("Application executed...");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}
