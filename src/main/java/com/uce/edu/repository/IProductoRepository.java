package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Producto;

public interface IProductoRepository {
	
	public Producto seleccionar(Integer id);

	public void ingresar(Producto producto);

	public void actualizar(Producto producto);

	public void eliminar(Integer id);

}
