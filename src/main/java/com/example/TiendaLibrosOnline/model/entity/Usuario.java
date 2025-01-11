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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Usuario")
public class Usuario extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

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
    
    @ToString.Exclude
    @OneToMany(mappedBy = "usuario",fetch = FetchType.LAZY)
    private List<Libro> libros;
    
    @OneToMany(fetch = FetchType.EAGER,mappedBy = "idUsuario")
    private Set<Access> access=new HashSet<>();
    
    public boolean hasRole(String roleName) {
    	
    	Iterator<Access> iterator=this.access.iterator();
    	
    	while (iterator.hasNext()) {
			Access role= iterator.next();
			if(role.getIdRol().getNombre().equals(roleName)) {
				return true;
			}
		}
    	
    	return false;
    	
    }
    

    @Builder(builderMethodName = "UserBuilders")
    public Usuario(String nombre, String apellido, Date fechaNacimiento, Integer idUsuario, String genero,
                   String direccion, String telefono, String email, String password) {
        super(nombre, apellido, fechaNacimiento);
        this.idUsuario = idUsuario;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
    }

    
}