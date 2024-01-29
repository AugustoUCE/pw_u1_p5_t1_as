package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.repository.modelo.DetalleFactura;
import com.example.demo.ventas.repository.modelo.Factura;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class Pa2U3P5AsApplication implements CommandLineRunner {

	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Inner join");
		Factura factura = this.facturaService.buscarInnerJoin("0001-02569");
		System.out.println(factura);

		System.out.println("Right join");
		Factura factura1 = this.facturaService.buscarRightJoin("1752083905");
		System.out.println(factura1);
		
		System.out.println("Left join");
		Factura factura2 = this.facturaService.buscarLeftJoin("1752083905");
		System.out.println(factura2);
		
		System.out.println("Full join");
		LocalDateTime fecha=LocalDateTime.of(2024, 1, 23, 20, 0);
		List<Factura> list = this.facturaService.buscarFullJoin(fecha);
		for (Factura factura5 : list) {
			System.out.println(factura5);
		}
		
		

	}

}
