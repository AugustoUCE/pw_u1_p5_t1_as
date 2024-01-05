package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Cliente;

public interface IClienteRepository {

	public Cliente seleccionar(Integer id);

	public void ingresar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public void eliminar(Integer id);

}
