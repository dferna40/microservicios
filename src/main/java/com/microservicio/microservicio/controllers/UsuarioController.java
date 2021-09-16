package com.microservicio.microservicio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.Usuario;

@RestController
public class UsuarioController {

	@RequestMapping(value = "usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNombre("David");
		usuario.setApellido("Fernandez");
		usuario.setEmail("dferna40@gmail.com");
		usuario.setTelefono("675430271");
		usuario.setPassword("pass");
		return usuario;
	}
	
	@RequestMapping(value = "modificarUsuario")
	public Usuario modificarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("David");
		usuario.setApellido("Fernandez");
		usuario.setEmail("dferna40@gmail.com");
		usuario.setTelefono("675430271");
		usuario.setPassword("pass");
		return usuario;
	}
	
	@RequestMapping(value = "eliminarUsuario")
	public Usuario eliminarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre("David");
		usuario.setApellido("Fernandez");
		usuario.setEmail("dferna40@gmail.com");
		usuario.setTelefono("675430271");
		usuario.setPassword("pass");
		return usuario;
	}
	
	
}
