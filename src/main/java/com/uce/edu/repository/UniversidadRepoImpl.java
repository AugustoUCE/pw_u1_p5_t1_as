package com.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Universidad;
import com.uce.edu.repository.modelo.dto.UniversidadDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UniversidadRepoImpl implements IUniversidadRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.entityManager.persist(universidad);
	}

	@Override
	public List<UniversidadDTO> seleccionarNombreRanking() {
		// TODO Auto-generated method stub
		String jpql = "SELECT NEW com.uce.edu.repository.modelo.dto.UniversidadDTO(u.nombre,u.ranking) FROM Universidad u";
		TypedQuery<UniversidadDTO> myQuery = this.entityManager.createQuery(jpql, UniversidadDTO.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Universidad> seleccionarporNombre() {
		// TODO Auto-generated method stub
		String jpql = "SELECT u FROM Universidad u JOIN u.estudiantes e";
		TypedQuery<Universidad> myQuery = this.entityManager.createQuery(jpql, Universidad.class);

		List<Universidad> list = myQuery.getResultList();
		for (Universidad universidad : list) {
			universidad.getEstudiantes().size();
		}

		return list;
	}

	@Override
	public List<Universidad> seleccionarporRanking() {
		// TODO Auto-generated method stub
		String jpql = "SELECT u FROM Universidad u JOIN u.estudiantes e";
		TypedQuery<Universidad> myQuery = this.entityManager.createQuery(jpql, Universidad.class);

		List<Universidad> list = myQuery.getResultList();
		for (Universidad universidad : list) {
			universidad.getEstudiantes().size();
		}

		return list;
	}

	@Override
	public List<Universidad> seleccionarporNombreRight() {
		// TODO Auto-generated method stub
		String jpql = "SELECT u FROM Universidad u LEFT JOIN u.estudiantes e";
		TypedQuery<Universidad> myQuery = this.entityManager.createQuery(jpql, Universidad.class);

		List<Universidad> list3 = myQuery.getResultList();
			for (Universidad universidad3 : list3) {
				universidad3.getEstudiantes().size();
			}
		return list3;
		
		
	}


	@Override
	public List<Universidad> seleccionarporNombreLeft() {
		// TODO Auto-generated method stub
		String jpql = "SELECT u FROM Universidad u LEFT JOIN u.estudiantes e";
		TypedQuery<Universidad> myQuery = this.entityManager.createQuery(jpql, Universidad.class);

		List<Universidad> list4 = myQuery.getResultList();
		

			for (Universidad universidad4 : list4) {
				universidad4.getEstudiantes().size();
			}
		return list4;
	}

	@Override
	public List<Universidad> seleccionarporNombreFull() {
		// TODO Auto-generated method stub
		String jpql = "SELECT u FROM Universidad u FULL JOIN u.estudiantes e";
		TypedQuery<Universidad> myQuery = this.entityManager.createQuery(jpql, Universidad.class);

		List<Universidad> list5 = myQuery.getResultList();
		

			for (Universidad universidad5 : list5) {
				universidad5.getEstudiantes().size();
			}
		return list5;	}

	@Override
	public List<Universidad> seleccionarporNombreFetch() {
		// TODO Auto-generated method stub
		String jpql="SELECT u FROM Universidad u JOIN FETCH u.estudiantes e";
		TypedQuery<Universidad> myQuery=this.entityManager.createQuery(jpql,Universidad.class);
	
		return myQuery.getResultList();
	}

	@Override
	public List<Estudiante> seleccionarporRankingRight() {
		

		return null;
	}

	@Override
	public List<Universidad> seleccionarporRankingLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Universidad> seleccionarporRankingFull() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Universidad> seleccionarporRankingFetch() {
		// TODO Auto-generated method stub
		return null;
	}

}
