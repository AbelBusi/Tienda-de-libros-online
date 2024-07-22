package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;
    
    @Column(name = "genero",nullable = false)
    private String genero;

    @Column(name = "direccion",nullable = false)
    private String direccion;
    
    @Column(name = "telefono",nullable = false)
    private String telefono;
    
    @Column(name = "email",nullable = false)
    private String email;
    
    @Column(name = "password",nullable = false)
    private String password;
    
    @Column(name = "rol",nullable = true)
    private String rol;

    @ToString.Exclude
    @OneToMany(mappedBy = "idUsuario",fetch = FetchType.LAZY)
    private List<Libro> libros;

    @Builder
	public Usuario(Integer idUsuario, String nombre, String apellido, Date fechaNacimiento,String direccion, String email,
			String genero, String password, String rol, String telefono) {
		super( nombre, apellido, fechaNacimiento);
		this.idUsuario=idUsuario;
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
		return Objects.hash(direccion, email, genero, idUsuario, libros, password, rol, telefono);
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
				&& Objects.equals(genero, other.genero) && Objects.equals(idUsuario, other.idUsuario)
				&& Objects.equals(libros, other.libros) && Objects.equals(password, other.password)
				&& Objects.equals(rol, other.rol) && Objects.equals(telefono, other.telefono);
	}
    
}
