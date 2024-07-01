package com.example.TiendaLibrosOnline.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {
		
		http
				.authorizeHttpRequests((requests) -> requests
						.requestMatchers("/vendor/**").permitAll()
						.requestMatchers("/images/**").permitAll()
						.requestMatchers("/home").permitAll()
						.requestMatchers("/usuario/ingresar").permitAll()
						.requestMatchers("/usuario/accederUusario").permitAll()
						.requestMatchers("/usuario/crearCuenta").permitAll()
						.anyRequest().authenticated()
						)
				.formLogin( (form )->form 
						.loginPage("/acceso/login")
						.permitAll())
				.logout((logout)-> logout.permitAll() );
		
		return http.build() ;
		
	}
	


}
