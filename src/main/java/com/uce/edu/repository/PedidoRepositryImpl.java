package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Pedido;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PedidoRepositryImpl implements IPedidoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Pedido seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pedido.class, id);
	}

	@Override
	public void ingresar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pedido);

	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pedido);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Pedido p = this.seleccionar(id);
		this.entityManager.remove(p);
	}

}
