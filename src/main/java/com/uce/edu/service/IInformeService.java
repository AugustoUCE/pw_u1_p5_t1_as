package com.uce.edu.service;

import com.uce.edu.repository.modelo.Informe;

public interface IInformeService {
	
	public Informe buscar(Integer id);

	public void guardar(Informe informe);

	public void actualizar(Informe informe);

	public void eliminar(Integer id);

}
