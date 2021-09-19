package com.microservicio.microservicio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.microservicio.models.Usuario;

@Repository
@Transactional
public class UsuarioDaoImpl implements IUsuarioDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Usuario> getUsuarios() {
		String query = "FROM Usuario";
		return entityManager.createQuery(query).getResultList();
	}

}
