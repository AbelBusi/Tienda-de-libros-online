package com.example.TiendaLibrosOnline.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;


public class WebSecurityConfigAdmin {
/*
	@Bean
	public SecurityFilterChain securityFilterChain(	HttpSecurity httpSecurity) throws Exception{
		
		httpSecurity
		.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests((requests) -> requests
					.requestMatchers("/vendor/**").permitAll()
					.requestMatchers("/images/**").permitAll()
					.requestMatchers("/admin/**").permitAll()/*
					.requestMatchers("/admin/agregarProducto").permitAll()
					.requestMatchers("/admin/formEditorial").permitAll()
					.requestMatchers("/admin/formCategoria").permitAll()
					.requestMatchers("/admin/formAutor").permitAll()
					.requestMatchers("/admin/libros").permitAll()
					.requestMatchers("/admin/managent/categories").permitAll()
					.requestMatchers("/admin/managent/editorials").permitAll()
					.requestMatchers("/admin/managent/rankingBooks").permitAll()
					.requestMatchers("/admin/managent/actors").permitAll()
					.requestMatchers("/admin/logistics").permitAll()/*  
					/*
					.anyRequest().authenticated()
					)
			.formLogin( (form )->form 
					.loginPage("/admin/ingresarAdmin")
					.usernameParameter("email")
					.passwordParameter("password")
					.defaultSuccessUrl("/home")
					.permitAll())
			.logout((logout)->
					logout.logoutUrl("/usuario/cerrarSession")
							.clearAuthentication(true)
							.deleteCookies()
							.logoutSuccessUrl("/home")
							.permitAll()
			);
	
	return httpSecurity.build() ;
	}
	
	*/
}
