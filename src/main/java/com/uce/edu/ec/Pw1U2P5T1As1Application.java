package com.uce.edu.ec;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.ec.repository.modelo.Curso;
import com.uce.edu.ec.repository.modelo.Estudiante;
import com.uce.edu.ec.service.ICursoService;
import com.uce.edu.ec.service.IEstudianteService;

@SpringBootApplication
public class Pw1U2P5T1As1Application implements CommandLineRunner{
	
	@Autowired 
	private IEstudianteService estudianteService;
	
	@Autowired 
	private ICursoService cursoService;

	public static void main(String[] args) {
		SpringApplication.run(Pw1U2P5T1As1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		
		Estudiante e= new Estudiante();
		e.setNombre("Augusto");
		e.setApellido("Salazar");
		e.setCedula("1752083905");
		
		Estudiante e1= new Estudiante();
		e1.setNombre("Matias");
		e1.setApellido("Romero");
		e1.setCedula("1745892615");
		
	
		
		Curso c =new Curso();
		c.setNombre("Programacion");
		c.setSemestre("sexto");
		c.setFechaInicio(LocalDateTime.now());
		c.setFechaFinalizacion(null);
		
		Set<Estudiante> estudiantes=new HashSet<>();
		estudiantes.add(e);
		estudiantes.add(e1);
		
		Set<Curso> cursos= new HashSet<>();
		cursos.add(c);
		
		e.setCursos(cursos);
		e1.setCursos(cursos);
		c.setEstudiantes(estudiantes);
		
	//	this.cursoService.guardar(c);
		
	//	this.cursoService.buscar(1);
	
		
		
		
	/*	
		Curso c1 =this.cursoService.buscar(1);
		c1.setFechaFinalizacion(LocalDateTime.now());
		cursos.add(c1);
		this.cursoService.actualizar(c1);
		
	*/
		
		this.cursoService.eliminar(1);
		
		
		
	}

}
