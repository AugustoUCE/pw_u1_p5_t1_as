package com.uce.edu;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;

@SpringBootApplication
public class Pa2U1P5AsApplication implements CommandLineRunner{

	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private Materia materia;

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.materia.setCodigo("M1");
		this.materia.setNombre("P.Avanzada");
		this.materia.setNumeroCreditos(10);
		
		this.materiaService.registrar(materia);
		
		//verificar si se inserto en la list
		System.out.println("buscar");

		Materia mate = this.materiaService.buscar("M1");
		System.out.println(mate);
		
		System.out.println("Inicio de reporte");
		List<Materia> reporte=this.materiaService.buscarTodos();
		for (Materia materia : reporte) {
			System.out.println(materia);
		}
		
		System.out.println("fin");
		
		
		//actulizar el objeto
		System.out.println("actualizar");

		mate.setNumeroCreditos(20);
		this.materiaService.actualizar(mate);
		
		Materia mate2=this.materiaService.buscar("M1");
		System.out.println(mate2);
		//borrar
		
		System.out.println("borrar");
		this.materiaService.eliminar("M1");
		mate2= this.materiaService.buscar("M1");
		System.out.println(mate2);
		
		
		//
		
		
	}

}
