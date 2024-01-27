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
public class Pa2U3P5AsApplication implements CommandLineRunner{
	
	@Autowired
	private IFacturaService facturaService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3P5AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Inner join");
		List<Factura> list=this.facturaService.buscarInnerJoin();
		for (Factura factura : list) {
			System.out.println(factura);
		}
		
		System.out.println("\nRight join");

		List<Factura> list1=this.facturaService.buscarRightJoin();
		for (Factura factura1 : list1) {
			System.out.println(factura1.getNumero());
		}
		
		
		System.out.println("\nLeft join");

		List<Factura> list2=this.facturaService.buscarLeftJoin();
		for (Factura factura2 : list2) {
			System.out.println(factura2.getNumero());
		}
		
		System.out.println("\nFull join");

		List<Factura> list3=this.facturaService.buscarLeftJoin();
		for (Factura factura3 : list3) {
			System.out.println(factura3);
			for (DetalleFactura d : factura3.getDetalleFacturas()) {
				System.out.println(d);
			}
		}
		
		
	}

}
