package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usuario")
public class Usuario extends Persona{
    
    @Column(name = "genero")
    private String genero;

    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;
    
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "rol")
    private String rol;

    @OneToMany(mappedBy = "idUsuario",fetch = FetchType.LAZY)
    private List<Libro> libros;

    @Builder
	public Usuario(Integer idPersona, String nombre, String apellido, Date fechaNacimiento,String direccion, String email,
			String genero, String password, String rol, String telefono) {
		super(idPersona, nombre, apellido, fechaNacimiento);
		this.direccion=direccion;
		this.email=email;
		this.genero=genero;
		this.password=password;
		this.rol=rol;
		this.telefono=telefono;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, email, genero, libros, password, rol, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(email, other.email)
				&& Objects.equals(genero, other.genero) && Objects.equals(libros, other.libros)
				&& Objects.equals(password, other.password) && Objects.equals(rol, other.rol)
				&& Objects.equals(telefono, other.telefono);
	}
	
	
    
    
}
