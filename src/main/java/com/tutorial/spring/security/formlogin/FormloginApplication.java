package com.tutorial.spring.security.formlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FormloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormloginApplication.class, args);
	}
}
