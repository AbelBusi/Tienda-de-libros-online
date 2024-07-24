package com.example.TiendaLibrosOnline.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordBCrypt {
	
	@Bean
	public PasswordEncoder encoder() {
		
		return new BCryptPasswordEncoder();
	}

}
