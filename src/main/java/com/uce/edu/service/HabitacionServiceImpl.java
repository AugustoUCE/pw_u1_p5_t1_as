package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IHabitacionRepository;
import com.uce.edu.repository.modelo.Habitacion;
@Service
public class HabitacionServiceImpl implements IHabitacionesService {

	@Autowired
	private IHabitacionRepository habitacionRepository;
	
	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Habitacion habitacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actulizar(Habitacion habitacion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Habitacion buscarPorNumeroHabitacion(String numero) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarPorNumeroHabitacion(numero);
	}

	@Override
	public Habitacion buscarPorClase(String clase) {
		// TODO Auto-generated method stub
		return this.habitacionRepository.seleccionarPorClase(clase);
	}

}
