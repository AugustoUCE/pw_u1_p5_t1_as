package com.uce.edu.ec.repository;

import com.uce.edu.ec.repository.modelo.Estudiante;

public interface IEstudianteRepository {

	public Estudiante seleccionar(Integer id);

	public void ingresar(Estudiante estudiante);

	public void actualizar(Estudiante estudiante);

	public void eliminar(Integer id);

}
