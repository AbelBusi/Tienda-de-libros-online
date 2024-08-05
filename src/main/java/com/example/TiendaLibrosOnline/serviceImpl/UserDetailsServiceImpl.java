package com.example.TiendaLibrosOnline.serviceImpl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.TiendaLibrosOnline.model.entity.Usuario;
import com.example.TiendaLibrosOnline.repository.IUsuarioRepository;
import com.example.TiendaLibrosOnline.security.SecurityUser;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService{
	
	private final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	
	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioRepository.findByEmail(username);
		if(usuario==null) {
			System.out.println("prueba xd");
			System.out.println("Usuario: "+username);
			throw new UsernameNotFoundException(username);
		}
		return new SecurityUser(usuario);
	}
	
	

}
