package com.example.TiendaLibrosOnline.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
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
						.requestMatchers("/usuario/guardarUsuario").permitAll()
						.requestMatchers("/usuario/crearCuenta").permitAll()
						.requestMatchers("/usuario/iniciarSesion").permitAll()
						.requestMatchers("/admin/homeConfigurer").permitAll()
						.requestMatchers("/admin/agregarProducto").permitAll()
						.requestMatchers("/admin/formEditorial").permitAll()
						.requestMatchers("/admin/formCategoria").permitAll()
						.requestMatchers("/admin/formAutor").permitAll()
						.requestMatchers("/admin/libros").permitAll()
						.requestMatchers("/admin/managent/categories").permitAll()
						.requestMatchers("/admin/managent/editorials").permitAll()
						.requestMatchers("/admin/managent/rankingBooks").permitAll()
						.requestMatchers("/admin/managent/actors").permitAll()
						.requestMatchers("/admin/logistics").permitAll()
						.anyRequest().authenticated()
						)
				.formLogin( (form )->form 
						.loginPage("/usuario/ingresar")
						.permitAll())
				.logout((logout)-> logout.permitAll());
		
		return http.build() ;
		
	}


}
