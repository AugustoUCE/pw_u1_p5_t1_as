package com.example.demo.ventas.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.repository.modelo.Factura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class FacturaRepositoryImpl implements IFacturaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Factura seleccionarPorNumero(String numero) {
		// TODO Auto-generated method stub
		String jpql="SELECT f FROM Factura f WHERE f.numero=:var";
		TypedQuery<Factura> myQuery= this.entityManager.createQuery(jpql,Factura.class);
		myQuery.setParameter("var", numero);
		Factura fact=myQuery.getSingleResult();
		fact.getDetalleFacturas().size(); //le digo que cargue el detalle bajo demanda y con el size 
		
		
		return fact;
	}

	@Override
	public void insertar(Factura factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
		
	}


}
