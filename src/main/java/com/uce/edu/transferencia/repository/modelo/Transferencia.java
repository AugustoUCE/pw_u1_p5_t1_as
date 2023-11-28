package com.uce.edu.transferencia.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class Transferencia {

	private static int contadorSecuencial =0;

	private String numero;
	private LocalDateTime fecha;
	private BigDecimal monto;
	private CuentaBancaria cuentaOrigen;
	private CuentaBancaria cuentaDestino;

	public Transferencia() {
		this.numero=generarNumeroSecuencial();
	}

	public static String generarNumeroSecuencial() {
	    String numeroFormatado=String.format("%03d",contadorSecuencial++);  
		
		return numeroFormatado;
	    }
	// set y get

	public LocalDateTime getFecha() {
		return fecha;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public CuentaBancaria getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public CuentaBancaria getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(CuentaBancaria cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public static int getContadorSecuencial() {
		return contadorSecuencial;
	}

	public static void setContadorSecuencial(int contadorSecuencial) {
		Transferencia.contadorSecuencial = contadorSecuencial;
	}

	@Override
	public String toString() {
		return "Transferencia [numero=" + numero + ", fecha=" + fecha + ", monto=" + monto + ", cuentaOrigen="
				+ cuentaOrigen + ", cuentaDestino=" + cuentaDestino + "]";
	}
	

}
