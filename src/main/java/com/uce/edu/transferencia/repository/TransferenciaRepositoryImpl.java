package com.uce.edu.transferencia.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.transferencia.repository.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {
	
	private static List<Transferencia> base = new ArrayList<>();
	
	
	@Override
	public Transferencia seleccionar(String numero) {
		// TODO Auto-generated method stub
		for (Transferencia transferencia : base) {
			if (transferencia.getNumero().equals(numero)) {
				
				return transferencia;
			}
		}
		return null;
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		base.add(transferencia);
		System.out.println("Se inserto la transferencia");
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
		System.out.println("Se actualizo ");
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub

		Transferencia trans= this.seleccionar(numero);
		base.remove(trans);
		System.out.println("Se elimino ");
	}

}
