package com.example.TiendaLibrosOnline.model.dto;


import com.example.TiendaLibrosOnline.model.entity.Rol;
import com.example.TiendaLibrosOnline.model.entity.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rol_UsuarioDTO {
	
	private Rol idRol;
	private Usuario idUsuario;
	
	

}
