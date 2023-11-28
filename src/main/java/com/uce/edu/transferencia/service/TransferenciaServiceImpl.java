package com.uce.edu.transferencia.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
		// 1. buscar cta origen
		// solo si tengo logica de negocio ocupo la ICuentaService como no hay ocupo la
		// ICuentaRepository
		CuentaBancaria ctaOrigen = this.cuentaBancariaRepository.seleccionar(numeroOrigen);
		System.out.println(ctaOrigen.hashCode());

		// 2. consultar saldo
		BigDecimal saldoOrigen = ctaOrigen.getSaldo();
		// 3. validar el saldo
		if (saldoOrigen.compareTo(monto) >= 0) {
			// 4. restar el monto al saldo
			BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
			// 5. actualizar cta origen
			ctaOrigen.setSaldo(nuevoSaldoOrigen);
			this.cuentaBancariaRepository.actualizar(ctaOrigen);
			// 6. buscar cta destino
			CuentaBancaria ctaDestino = this.cuentaBancariaRepository.seleccionar(numeroDestino);
			// 7. Consultar saldo para sumar el saldo con la transferencia
			BigDecimal saldoDestino= ctaDestino.getSaldo();
			// 8. sumar el monto
			BigDecimal nuevoSaldoDestino=saldoDestino.add(monto);
			// 9. Actualizar cta destino
			ctaDestino.setSaldo(nuevoSaldoDestino);
			this.cuentaBancariaRepository.actualizar(ctaDestino);
			// 10. Crear la transferencia
			Transferencia transferencia= new Transferencia();
			transferencia.setCuentaOrigen(ctaOrigen);
			transferencia.setCuentaDestino(ctaDestino);
			transferencia.setFecha(LocalDateTime.now());
			transferencia.setMonto(monto);
			transferencia.setNumero(transferencia.generarNumeroSecuencial());
			this.transferenciaRepository.insertar(transferencia);
			System.out.println("Trasnferencia realizada con exito"+"Numero transferencia: "+transferencia.getNumero());

		} else {
			System.out.println("Saldo no disponible");

		}

	}

	@Override
	public List<Transferencia> buscarTodo() {
		// TODO Auto-generated method stub
		return this.transferenciaRepository.reporteTodo();
	}

	@Override
	public void depositar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		//cta origen
		CuentaBancaria ctaOrigen = this.cuentaBancariaRepository.seleccionar(numeroOrigen);
		
		BigDecimal montoO = ctaOrigen.getSaldo();
		BigDecimal montoOF = monto.subtract(montoO);
		ctaOrigen.setSaldo(montoOF);
		this.cuentaBancariaRepository.actualizar(ctaOrigen);
		
		//el valor que me voy a descontar
		//ctadestino
		CuentaBancaria ctaDestino = this.cuentaBancariaRepository.seleccionar(numeroOrigen);

		BigDecimal comision = monto.multiply(new BigDecimal(0.10));
		BigDecimal montoFinal=monto.subtract(comision);
		
		ctaDestino.setSaldo(montoFinal);
		this.cuentaBancariaRepository.actualizar(ctaDestino);

		System.out.println("Desposito realizada con exito");

		
	}

}
