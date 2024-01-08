package com.uce.edu.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.ec.repository.ICursoRepository;
import com.uce.edu.ec.repository.modelo.Curso;

@Service
public class CursoServiceImpl implements ICursoService {

	@Autowired
	private ICursoRepository cursoRepository;

	@Override
	public Curso buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.cursoRepository.seleccionar(id);
	}

	@Override
	public void guardar(Curso curso) {
		// TODO Auto-generated method stub
		this.cursoRepository.ingresar(curso);
	}

	@Override
	public void actualizar(Curso curso) {
		// TODO Auto-generated method stub
		this.cursoRepository.actualizar(curso);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.cursoRepository.eliminar(id);
	}

}
