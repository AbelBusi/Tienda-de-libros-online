package com.example.TiendaLibrosOnline.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.model.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CustomUserDetails implements UserDetails{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario;

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return usuario.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usuario.getEmail();
	}
	
	public String getRol() {
		return usuario.getRol().getNombre();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Set<Rol> roles = usuario.getRoles();
		List<SimpleGrantedAuthority> authorities= new ArrayList<SimpleGrantedAuthority>();
		for(Rol role: roles) {
			authorities.add(new SimpleGrantedAuthority(role.getNombre()));
		}
		return authorities;
	}
	
	public boolean hasRole(String roleName) {
		
		return this.usuario.hasRole(roleName); 
	}




}
