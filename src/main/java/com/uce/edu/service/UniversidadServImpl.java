package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IUniversidadRepo;
import com.uce.edu.repository.modelo.Universidad;
import com.uce.edu.repository.modelo.dto.UniversidadDTO;

@Service
public class UniversidadServImpl implements IUniversidadServ {
	@Autowired
	private IUniversidadRepo universidadRepo;

	@Override
	public void guardar(Universidad universidad) {
		// TODO Auto-generated method stub
		this.universidadRepo.insertar(universidad);

	}

	@Override
	public List<UniversidadDTO> buscarNombreRanking() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarNombreRanking();
	}

	@Override
	public List<Universidad> buscarporNombre() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarporNombre();
	}

	@Override
	public List<Universidad> buscarporRanking() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarporRanking();
	}

	@Override
	public List<Universidad> buscarporNombreRight() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarporNombreRight();
	}

	@Override
	public List<Universidad> buscarporNombreLeft() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarporNombreLeft();
	}

	@Override
	public List<Universidad> buscarporNombreFull() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarporNombreFull();
	}

	@Override
	public List<Universidad> buscarporNombreFetch() {
		// TODO Auto-generated method stub
		return this.universidadRepo.seleccionarporNombreLeft();
	}

}
