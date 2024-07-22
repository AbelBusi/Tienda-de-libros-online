package com.example.TiendaLibrosOnline.model.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Escritor extends Texto{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEscritor;
	
	private Date fechaNacimiento;
	
	public Escritor(String nombre,String descripcion,String ubicacion, int idEscritor,Date fechaNacimiento) {
		super(nombre,descripcion,ubicacion);
		this.idEscritor=idEscritor;
		this.fechaNacimiento=fechaNacimiento;
	}
	

}
