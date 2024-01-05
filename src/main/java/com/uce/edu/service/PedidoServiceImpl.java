package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uce.edu.repository.IPedidoRepository;
import com.uce.edu.repository.modelo.Pedido;

public class PedidoServiceImpl implements IPedidoService {
	@Autowired
	private IPedidoRepository pedidoRepository;

	@Override
	public Pedido buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.pedidoRepository.seleccionar(id);
	}

	@Override
	public void guardar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepository.ingresar(pedido);
	}

	@Override
	public void actualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepository.actualizar(pedido);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.pedidoRepository.eliminar(id);
	}

}
