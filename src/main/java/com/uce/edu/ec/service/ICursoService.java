package com.uce.edu.ec.service;

import com.uce.edu.ec.repository.modelo.Curso;

public interface ICursoService {
	
	public Curso buscar(Integer id);

	public void guardar(Curso curso);

	public void actualizar(Curso curso);

	public void eliminar(Integer id);

}
