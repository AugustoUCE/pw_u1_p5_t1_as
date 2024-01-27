package com.example.demo.ventas.repository;

import java.util.List;

import com.example.demo.ventas.repository.modelo.Factura;

public interface IFacturaRepository {
	
	public Factura seleccionarPorNumero(String numero);
	public void insertar(Factura factura);
	
	//inner join
	public List<Factura> seleccionarInnerJoin();
	//outerjoin
	public List<Factura> seleccionarRightJoin();
	public List<Factura> seleccionarLeftJoin();
	public List<Factura> seleccionarFullJoin();
	

}
