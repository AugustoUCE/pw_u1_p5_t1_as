package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Informe;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InformeRepositoryImpl implements IInformeRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Informe seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Informe.class, id);
	}

	@Override
	public void ingresar(Informe informe) {
		// TODO Auto-generated method stub
		this.entityManager.persist(informe);
	}

	@Override
	public void actualizar(Informe informe) {
		// TODO Auto-generated method stub
		this.entityManager.merge(informe);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Informe i = this.seleccionar(id);
		this.entityManager.remove(i);
	}

}
