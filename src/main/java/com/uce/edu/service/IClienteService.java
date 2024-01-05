package com.uce.edu.service;

import com.uce.edu.repository.modelo.Cliente;

public interface IClienteService {
	
	public Cliente buscar(Integer id);

	public void guardar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public void eliminar(Integer id);


}
