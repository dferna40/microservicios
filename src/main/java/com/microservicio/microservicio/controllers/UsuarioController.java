package com.microservicio.microservicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.microservicio.dao.IUsuarioDao;
import com.microservicio.microservicio.models.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuarioDao usuarioDao;

	@RequestMapping(value = "api/usuarios/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		Usuario usuario = new Usuario();
		
//		usuario.setId(id);
//		usuario.setNombre("David");
//		usuario.setApellido("Fernandez");
//		usuario.setEmail("dferna40@gmail.com");
//		usuario.setTelefono("675430271");
//		usuario.setPassword("pass");
		
		return usuario;
	}
	
	/**
	 * Recupera todos los usuarios de Base de datos
	 * @return lista de usuarios
	 */
	@RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
	public List<Usuario> getUsuarios() {
		return usuarioDao.getUsuarios();
	}
	
	/**
	 * Elimina usuario de Base de datos por ID
	 * @param id del usuario
	 */
	@RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
	public void eliminarUsuario(@PathVariable Long id) {
		usuarioDao.eliminarUsuario(id);
	}
	
	@RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
	public void registarUsuario(@RequestBody Usuario usuario) {
		usuarioDao.registrar(usuario);
	}
}
