package com.example.TiendaLibrosOnline.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.TiendaLibrosOnline.serviceImpl.UserDetailsServiceImpl;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfigUser {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {
	
		
		http
			.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests((requests) -> requests
						.requestMatchers("/vendor/**").permitAll()
						.requestMatchers("/images/**").permitAll()
						.requestMatchers("/home").permitAll()
						.requestMatchers("/usuario/ingresar").permitAll()
						.requestMatchers("/usuario/guardarUsuario").permitAll()
						.requestMatchers("/usuario/crearCuenta").permitAll()
						.requestMatchers("/usuario/iniciarSesion").permitAll()
						.requestMatchers("/admin/**").hasAuthority("ADMIN")
						/*
						.requestMatchers("/admin/agregarProducto").permitAll()
						.requestMatchers("/admin/formEditorial").permitAll()
						.requestMatchers("/admin/formCategoria").permitAll()
						.requestMatchers("/admin/formAutor").permitAll()
						.requestMatchers("/admin/libros").permitAll()
						.requestMatchers("/admin/managent/categories").permitAll()
						.requestMatchers("/admin/managent/editorials").permitAll()
						.requestMatchers("/admin/managent/rankingBooks").permitAll()
						.requestMatchers("/admin/managent/actors").permitAll()
						.requestMatchers("/admin/logistics").permitAll()*/
						.anyRequest().authenticated()
						)
				.formLogin( (form )->form 
						.loginPage("/usuario/ingresar")
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
		
		return http.build() ;
		
	}
	
	/*
	@Bean
	public SecurityFilterChain securityAdminFilterChain(	HttpSecurity httpSecurity) throws Exception{
		
		httpSecurity
		.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests((requests) -> requests
					.requestMatchers("/admin/homeConfigurer").authenticated()
					.anyRequest().authenticated()
					)
			.formLogin( (form )->form 
					.loginPage("/admin/ingresarAdmin")
					.permitAll())
			.logout((logout)->
					logout.permitAll()
			);
	
	return httpSecurity.build() ;
	}*/

	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Bean
	public static PasswordEncoder passwordEncoder() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configure(AuthenticationManagerBuilder auth )throws Exception {
		
		auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder());
		
	}
	

}