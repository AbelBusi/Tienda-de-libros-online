package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Autor")
public class Autor extends Persona {
	


	@Column(name = "sexo")
    private String sexo;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "religion")
    private String religion;

    @Column(name = "padre")
    private String padre;
    
    @Column(name="madre")
    private String madre;

    @Column(name = "hijos")
    private String hijos;

    @Column(name = "educacion")
    private String educacion;

    @Column(name = "ocupacion")
    private String ocupacion;

    @OneToMany(mappedBy = "idAutor")
    private List<Libro> libros;

	
    public Autor(Integer idPersona, String nombre, String apellido, Date fechaNacimiento) {
		super(idPersona, nombre, apellido, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int hashCode() {
		return Objects.hash(educacion, hijos, libros, madre, nacionalidad, ocupacion, padre, religion, sexo);
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
				&& Objects.equals(libros, other.libros) && Objects.equals(madre, other.madre)
				&& Objects.equals(nacionalidad, other.nacionalidad) && Objects.equals(ocupacion, other.ocupacion)
				&& Objects.equals(padre, other.padre) && Objects.equals(religion, other.religion)
				&& Objects.equals(sexo, other.sexo);
	}

    
}
