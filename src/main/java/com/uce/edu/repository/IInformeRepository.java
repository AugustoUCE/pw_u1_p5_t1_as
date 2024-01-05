package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Informe;

public interface IInformeRepository {
	
	
	public Informe seleccionar(Integer id);

	public void ingresar(Informe informe);

	public void actualizar(Informe informe);

	public void eliminar(Integer id);

}
