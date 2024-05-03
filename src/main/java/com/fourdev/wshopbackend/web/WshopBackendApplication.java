package com.fourdev.wshopbackend.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.fourdev.wshopbackend", "com.fourdev"})
@EnableJpaRepositories(basePackages = {"com.fourdev.wshopbackend.infra.impl"})
@EntityScan(basePackages = {"com.fourdev.wshopbackend.domain"})
public class WshopBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WshopBackendApplication.class, args);
	}

}
