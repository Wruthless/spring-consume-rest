package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ConsumingrestApplication {

	/**
	 * @Logger Used to send output to the console.
	 */
	private static final Logger log = LoggerFactory.getLogger(ConsumingrestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingrestApplication.class, args);
	}

	/**
	 * @Bean specifies that the method returns a bean to be managed by Spring context.
	 * @param builder
	 * @return builder.build()
	 */
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/**
	 * Utilizes a REST template based on the Quote class.
	 * @param restTemplate
	 * @return Maps the API payload to our Quote class and uses the logger to display.
	 * @throws Exception
	 */
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject("http://localhost:8080/api/random", Quote.class);
			log.info(quote.toString());
		};
	}
}
