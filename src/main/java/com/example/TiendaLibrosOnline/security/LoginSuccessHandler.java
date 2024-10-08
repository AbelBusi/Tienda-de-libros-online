package com.example.TiendaLibrosOnline.security;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{
	
	static String ROLE_USUARIO="USER"; 
	static String ROLE_ADMIN="ADMIN"; 
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CustomUserDetails userDetails =(CustomUserDetails) authentication.getPrincipal();
		String redirectURL= request.getContextPath();
		
		if(userDetails.hasRole(ROLE_ADMIN)) {
			redirectURL="/BookStrore/admin/homeConfigurer";
		}
		else if (userDetails.hasRole(ROLE_USUARIO)) {
			redirectURL="/BookStrore/home";
		}
		
		response.sendRedirect(redirectURL);
	}
	

}
