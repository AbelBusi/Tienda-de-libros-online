package com.example.TiendaLibrosOnline.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Autor")
public class Autor extends Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_autor")
	private Integer idAutor;

	@Column(name = "sexo", nullable = false)
	private String sexo;

	@Column(name = "nacionalidad", nullable = false)
	private String nacionalidad;

	@Column(name = "religion", nullable = false)
	private String religion;

	@Column(name = "padre", nullable = false)
	private String padre;

	@Column(name = "madre", nullable = false)
	private String madre;

	@Column(name = "hijos", nullable = false)
	private String hijos;

	@Column(name = "educacion", nullable = false)
	private String educacion;

	@Column(name = "ocupacion", nullable = false)
	private String ocupacion;

	@OneToMany(mappedBy = "idAutor")
	private List<Libro> libros;

	public Autor(Integer idPersona, String nombre, String apellido, Date fechaNacimiento) {
		super(nombre, apellido, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(educacion, hijos, idAutor, libros, madre, nacionalidad, ocupacion, padre, religion, sexo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(educacion, other.educacion) && Objects.equals(hijos, other.hijos)
				&& Objects.equals(idAutor, other.idAutor) && Objects.equals(libros, other.libros)
				&& Objects.equals(madre, other.madre) && Objects.equals(nacionalidad, other.nacionalidad)
				&& Objects.equals(ocupacion, other.ocupacion) && Objects.equals(padre, other.padre)
				&& Objects.equals(religion, other.religion) && Objects.equals(sexo, other.sexo);
	}

}
