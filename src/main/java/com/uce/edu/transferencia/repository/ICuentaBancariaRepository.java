package com.uce.edu.transferencia.repository;

import java.util.List;

import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;

public interface ICuentaBancariaRepository {
	public CuentaBancaria seleccionar(String numero);
	public void insertar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	public void eliminar(String numero);
	
	public CuentaBancaria seleccionarEliminar(String numero);
	

}
