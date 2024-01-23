package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepositoryImpl implements IHabitacionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Habitacion seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Habitacion habitacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actulizar(Habitacion habitacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public Habitacion seleccionarPorNumeroHabitacion(String numero) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Habitacion> myCriteriaQuery = myCriteria.createQuery(Habitacion.class);
		Root<Habitacion> myFrom = myCriteriaQuery.from(Habitacion.class);
		Predicate condicionNumero = myCriteria.equal(myFrom.get("numero"), numero); 
		myCriteriaQuery.select(myFrom).where(condicionNumero);
		TypedQuery<Habitacion> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Habitacion seleccionarPorClase(String clase) {
		// TODO Auto-generated method stub
		
		CriteriaBuilder myCriteria = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Habitacion> myCriteriaQuery = myCriteria.createQuery(Habitacion.class);
		Root<Habitacion> myFrom = myCriteriaQuery.from(Habitacion.class);
		Predicate condicionClase = myCriteria.equal(myFrom.get("clase"), clase); 
		myCriteriaQuery.select(myFrom).where(condicionClase);
		TypedQuery<Habitacion> myTypedQuery = this.entityManager.createQuery(myCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

}
