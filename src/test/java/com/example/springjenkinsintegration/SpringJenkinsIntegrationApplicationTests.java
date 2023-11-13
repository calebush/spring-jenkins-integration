package com.example.springjenkinsintegration;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {
	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		assertEquals(true, true);
	}

}
