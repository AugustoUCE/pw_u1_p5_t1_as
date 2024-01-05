package com.uce.edu.service;

import com.uce.edu.repository.modelo.Producto;

public interface IProductoService {

	
	public Producto buscar(Integer id);

	public void guardar(Producto producto);

	public void actualizar(Producto producto);

	public void eliminar(Integer id);
}
