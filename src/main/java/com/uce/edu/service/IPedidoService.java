package com.uce.edu.service;

import com.uce.edu.repository.modelo.Pedido;

public interface IPedidoService {
	
	public Pedido buscar(Integer id);

	public void guardar(Pedido pedido);

	public void actualizar(Pedido pedido);

	public void eliminar(Integer id);

}
