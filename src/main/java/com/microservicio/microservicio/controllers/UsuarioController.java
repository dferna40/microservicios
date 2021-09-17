package com.microservicio.microservicio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.microservicio.models.Usuario;

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
	
	@RequestMapping(value = "usuarios")
	public List<Usuario> getUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList <Usuario>();
		Usuario usuario = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		
		usuario.setId(1L);
		usuario.setNombre("David");
		usuario.setApellido("Fernandez Ramirez");
		usuario.setEmail("dferna40@gmail.com");
		usuario.setTelefono("675430271");
		usuario.setPassword("pass");
		
		usuario2.setId(2L);
		usuario2.setNombre("Diego");
		usuario2.setApellido("Fernandez Ramirez");
		usuario2.setEmail("diego@gmail.com");
		usuario2.setTelefono("666555222");
		usuario2.setPassword("pass2");
		
		usuario3.setId(3L);
		usuario3.setNombre("Jose Antonio");
		usuario3.setApellido("Fernandez Ramirez");
		usuario3.setEmail("jaf@gmail.com");
		usuario3.setTelefono("654222138");
		usuario3.setPassword("pass3");
		
		usuarios.add(usuario);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		return usuarios;
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
