package com.uce.edu.transferencia.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.transferencia.repository.ICuentaBancariaRepository;
import com.uce.edu.transferencia.repository.ITransferenciaRepository;
import com.uce.edu.transferencia.repository.modelo.CuentaBancaria;
import com.uce.edu.transferencia.repository.modelo.Transferencia;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {

	@Autowired
	private ITransferenciaRepository transferenciaRepository;
	@Autowired
	private ICuentaBancariaRepository cuentaBancariaRepository;
	
	@Override
	public Transferencia buscar(String numero) {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.seleccionar(numero);
	}

	@Override
	public void guardar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.insertar(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.actualizar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.transferenciaRepository.eliminar(numero);
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		//1. buscar cta origen
		//solo si tengo logica de negocio ocupo la ICuentaService como no hay ocupo la ICuentaRepository
		CuentaBancaria ctaOrigen = this.cuentaBancariaRepository.seleccionar(numeroOrigen);
		//2. consultar saldo 
		//3. validar el saldo 
		//4. restar el monto al saldo
		//5. actualizar cta origen 
		
		
		//6. buscar cta destino 
		//7. Consultar saldo para sumar el saldo con la transferencia
		//8. sumar el monto
		//9. Actualizar cta destino
		
		
		//10. Crear la transferencia 
		
	}

}
