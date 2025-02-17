package com.example.TiendaLibrosOnline.serviceImpl;


import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.repository.IUsuarioRepository;
import com.example.TiendaLibrosOnline.security.CustomUserDetails;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioRepository.findByEmail(email);
		if(usuario==null) {
			System.out.println("prueba xd");
			System.out.println("Usuario: "+email);
			throw new UsernameNotFoundException(email);
		}

		ServletRequestAttributes attr= (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

		HttpSession session= attr.getRequest().getSession(true);

		session.setAttribute("idUsuario",usuario);

		session.setMaxInactiveInterval(300);

		logger.info("Usuario id: {}",usuario.getIdUsuario());

		return new CustomUserDetails(usuario);
	}
	
	

}
