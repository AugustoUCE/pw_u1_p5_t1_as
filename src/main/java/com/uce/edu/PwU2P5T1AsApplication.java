package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Informe;
import com.uce.edu.repository.modelo.Producto;
import com.uce.edu.service.IClienteService;
import com.uce.edu.service.IInformeService;
import com.uce.edu.service.IProductoService;

@SpringBootApplication
public class PwU2P5T1AsApplication implements CommandLineRunner{
	@Autowired
	private IProductoService productoService;
	@Autowired
	private IInformeService informeService;
	

	public static void main(String[] args) {
		SpringApplication.run(PwU2P5T1AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Producto p1= new Producto();
		p1.setCategoria("tecnologia");
		p1.setNombre("Sony");
		p1.setPeso(2.2);
		p1.setPrecio(new BigDecimal(55));
		

		;
		
		Informe inf = new Informe();
		p1.setInforme(inf);
		
	//	this.productoService.guardar(p1);
		
	
		inf.setFechaFabricacion(LocalDateTime.now());
		inf.setGarantia("5 años");
		inf.setNormativa("ISO 9001");
		inf.setNumeroSerie("Lic2024");
		inf.setProducto(p1);
		
		Producto p2 =this.productoService.buscar(7);
		p2.setCategoria("Hogar");
		this.productoService.actualizar(p2);
		
		
	
		
		
		
		
	}

}
