package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IProductoRepository;
import com.uce.edu.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	private IProductoRepository productoRepository;

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.productoRepository.seleccionar(id);
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.ingresar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepository.actualizar(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.productoRepository.eliminar(id);
	}

}
