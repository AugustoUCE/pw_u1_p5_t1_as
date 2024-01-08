package com.uce.edu.ec.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.ec.repository.modelo.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class CursoRepositoryImpl implements ICursoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Curso seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Curso.class, id);
	}

	@Override
	public void ingresar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.persist(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		this.entityManager.merge(curso);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Curso c = this.seleccionar(id);
		this.entityManager.remove(c);
	}

}
