package com.example.TiendaLibrosOnline.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private Integer idAutor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "sexo")
    private String sexo;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(educacion, other.educacion)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(hijos, other.hijos)
				&& Objects.equals(idAutor, other.idAutor) && Objects.equals(libros, other.libros)
				&& Objects.equals(madre, other.madre) && Objects.equals(nacionalidad, other.nacionalidad)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(ocupacion, other.ocupacion)
				&& Objects.equals(padre, other.padre) && Objects.equals(religion, other.religion)
				&& Objects.equals(sexo, other.sexo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, educacion, fechaNacimiento, hijos, idAutor, libros, madre, nacionalidad, nombre,
				ocupacion, padre, religion, sexo);
	}

    
}
