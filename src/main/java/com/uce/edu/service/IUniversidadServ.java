package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.Universidad;
import com.uce.edu.repository.modelo.dto.UniversidadDTO;

public interface IUniversidadServ {
	
	public void guardar(Universidad universidad);
	public List<UniversidadDTO> buscarNombreRanking();

	//innerjoin
	public List<Universidad> buscarporNombre();
	public List<Universidad> buscarporRanking();
	//right
	public List<Universidad> buscarporNombreRight();
	//LEFT
	public List<Universidad> buscarporNombreLeft();
	//full
	public List<Universidad> buscarporNombreFull();
	//fetch
	public List<Universidad> buscarporNombreFetch();
}
