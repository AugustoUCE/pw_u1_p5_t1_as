package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Curso;

public interface ICursoRepository {

	public Curso seleccionar(Integer id);

	public void ingresar(Curso curso);

	public void actualizar(Curso curso);

	public void eliminar(Integer id);
	
}
