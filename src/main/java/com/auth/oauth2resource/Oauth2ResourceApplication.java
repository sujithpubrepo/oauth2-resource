package com.auth.oauth2resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class Oauth2ResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ResourceApplication.class, args);
	}

}
