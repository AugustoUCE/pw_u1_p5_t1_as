package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Cliente;
import com.uce.edu.repository.modelo.Pedido;
import com.uce.edu.service.IClienteService;
import com.uce.edu.service.IPedidoService;

@SpringBootApplication
public class PwU2P5T1AsApplication implements CommandLineRunner {
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IPedidoService pedidoService;

	public static void main(String[] args) {
		SpringApplication.run(PwU2P5T1AsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Cliente c = new Cliente();
		c.setCorreoElectronico("cliente@uce.edu.ec");
		c.setDireccion("puengasi");
		c.setNombre("Augusto");
		c.setTelefono("0993457821");
		
		
		List<Pedido> pedidos= new ArrayList<>();
		Pedido p = new Pedido();
		p.setEstado("Listo");
		p.setFecha(LocalDateTime.now());
		p.setPrecio(new BigDecimal(5));
		Pedido p1 = new Pedido();
		p1.setEstado("Listo");
		p1.setFecha(LocalDateTime.now());
		p1.setPrecio(new BigDecimal(55));
		Pedido p2 = new Pedido();
		p2.setEstado("En espera");
		p2.setFecha(LocalDateTime.now());
		p2.setPrecio(new BigDecimal(15));
		pedidos.add(p);
		pedidos.add(p1);
		pedidos.add(p2);
		
		p.setCliente(c);
		p1.setCliente(c);
		p2.setCliente(c);
		
		c.setPedidos(pedidos);
		
		//this.clienteService.guardar(c);
		this.clienteService.eliminar(2);
	

	}

}
