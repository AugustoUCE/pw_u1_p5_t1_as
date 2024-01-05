package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IInformeRepository;
import com.uce.edu.repository.modelo.Informe;

@Service
public class InformeServiceImpl implements IInformeService {

	@Autowired
	private IInformeRepository informeRepository;

	@Override
	public Informe buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.informeRepository.seleccionar(id);
	}

	@Override
	public void guardar(Informe informe) {
		// TODO Auto-generated method stub
		this.informeRepository.ingresar(informe);
	}

	@Override
	public void actualizar(Informe informe) {
		// TODO Auto-generated method stub
		this.informeRepository.actualizar(informe);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.informeRepository.eliminar(id);
	}

}
