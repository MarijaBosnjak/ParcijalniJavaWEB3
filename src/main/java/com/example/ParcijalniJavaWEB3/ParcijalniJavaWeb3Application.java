package com.example.ParcijalniJavaWEB3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.ParcijalniJavaWEB3.domain")
@EnableJpaRepositories("com.example.ParcijalniJavaWEB3.repository")
public class ParcijalniJavaWeb3Application {

	public static void main(String[] args) {
		SpringApplication.run(ParcijalniJavaWeb3Application.class, args);
	}


	}



