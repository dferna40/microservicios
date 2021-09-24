package com.microservicio.microservicio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.sym.Name;
import com.microservicio.microservicio.models.Usuario;

@Repository
@Transactional
public class UsuarioDaoImpl implements IUsuarioDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public List<Usuario> getUsuarios() {
		String query = "FROM Usuario";
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public void eliminarUsuario(Long id) {
		Usuario usuario = entityManager.find(Usuario.class,id);
		entityManager.remove(usuario);
	}

	@Override
	public void registrar(Usuario usuario) {
		entityManager.merge(usuario);
	}

	@Override
	public boolean verificarEmailPassword(Usuario usuario) {
		String query = "FROM Usuario WHERE email = : email AND password = : password";
		List<Usuario> lista = entityManager.createQuery(query).setParameter("email", usuario.getEmail()).setParameter("password", usuario.getPassword()).getResultList();
		
		return !lista.isEmpty();
	}

}
