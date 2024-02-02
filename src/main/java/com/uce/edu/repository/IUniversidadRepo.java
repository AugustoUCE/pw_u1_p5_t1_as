package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Universidad;
import com.uce.edu.repository.modelo.dto.UniversidadDTO;

public interface IUniversidadRepo {
	
	public void insertar(Universidad universidad);
	
	public List<UniversidadDTO> seleccionarNombreRanking();
	
	//innerjoin
	public List<Universidad> seleccionarporNombre();
	public List<Universidad> seleccionarporRanking();
	//right
	public List<Universidad> seleccionarporNombreRight();
	public List<Estudiante> seleccionarporRankingRight();
	//left
	public List<Universidad> seleccionarporNombreLeft();
	public List<Universidad> seleccionarporRankingLeft();
	//FULL
	public List<Universidad> seleccionarporNombreFull();
	public List<Universidad> seleccionarporRankingFull();

	//FECTH
	public List<Universidad> seleccionarporNombreFetch();
	public List<Universidad> seleccionarporRankingFetch();
	

}
