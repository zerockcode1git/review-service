package org.zerock.review_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "org.zerock.review_service.clients")
public class ReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewServiceApplication.class, args);
	}

}
