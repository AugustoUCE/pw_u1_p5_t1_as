package com.uce.edu;


import java.util.ArrayList;
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
	private Materia materia;
	
	@Autowired
	private IMateriaService materiaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P5AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//una sola instacnia independientemente de la inyeccion que se realice siempre voy a tener un objeto



	}

}
