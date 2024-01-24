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
		
		Factura fac = new Factura();
		fac.setCedula("1752083905");
		fac.setFecha(LocalDateTime.now());
		fac.setNumero("0001-02569");
		
		DetalleFactura det1=new DetalleFactura();
		det1.setCantidad(4);
		det1.setCodigoBarras("54556875");
		det1.setNombreProducto("coca cola");
		det1.setFactura(fac);
		
		DetalleFactura det2=new DetalleFactura();
		det2.setCantidad(2);
		det2.setCodigoBarras("456456");
		det2.setNombreProducto("leche vita");
		det2.setFactura(fac);
		
		List<DetalleFactura> detalleFacturas= new ArrayList<>();
		detalleFacturas.add(det1);
		detalleFacturas.add(det2);
		
		fac.setDetalleFacturas(detalleFacturas);
		
		//this.facturaService.guardar(fac);
		
		Factura fact = this.facturaService.buscarPorNumero("0001-02569");
		/*for (DetalleFactura detalleFactura : fact.getDetalleFacturas()) {
			System.out.println(detalleFactura.getCodigoBarras());
		}*/
		System.out.println(fact);
		
	}

}
