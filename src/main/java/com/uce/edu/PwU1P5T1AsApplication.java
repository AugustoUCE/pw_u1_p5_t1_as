package com.uce.edu;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PwU1P5T1AsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PwU1P5T1AsApplication.class, args);
		
		System.out.println("Tarea primera subida");
		System.out.println("Cambios en la misma rama ");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
