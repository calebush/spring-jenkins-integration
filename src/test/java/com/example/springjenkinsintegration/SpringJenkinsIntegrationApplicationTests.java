package com.example.springjenkinsintegration;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringJenkinsIntegrationApplicationTests {


	@Test
	void contextLoads() {
		log.info("Inside Test....");
		assertEquals(true, true);
	}

}
