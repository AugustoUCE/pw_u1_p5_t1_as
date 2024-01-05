package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Pedido;

public interface IPedidoRepository {
	
	public Pedido seleccionar(Integer id);

	public void ingresar(Pedido pedido);

	public void actualizar(Pedido pedido);

	public void eliminar(Integer id);

}
