package com.example.TiendaLibrosOnline.model.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Admin")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends Persona{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_admin")
	private Integer idAdmin;
	
	@ManyToOne
	@JoinColumn(name = "rol")
	private Rol rol;
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "password")
	private String password;

	@Builder(builderMethodName = "adminBuilder")
	public Admin(String nombre, String apellido, Date fechaNacimiento, Integer idAdmin, Rol rol, String correo,
			String password) {
		super(nombre, apellido, fechaNacimiento);
		this.idAdmin = idAdmin;
		this.rol = rol;
		this.correo = correo;
		this.password = password;
	}
	
	
}
