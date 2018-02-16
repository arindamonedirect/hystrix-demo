package com.arindamod.hystrixdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author arindamroy
 */
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixDemoApplication {

	@Bean
	public RestTemplate rest(RestTemplateBuilder builder) {
		return builder.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(HystrixDemoApplication.class, args);
	}
}
