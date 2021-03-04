package com.westernunion.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.westernunion.assignment.service.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecureApiCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureApiCallApplication.class, args);
	}

}
