package com.uce.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Universidad;
import com.uce.edu.repository.modelo.dto.UniversidadDTO;
import com.uce.edu.service.IUniversidadServ;

@SpringBootApplication
public class Pa2U3DeberApplication implements CommandLineRunner {

	@Autowired
	private IUniversidadServ universidadServ;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U3DeberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
/*
		List<UniversidadDTO> universidadDTOs=this.universidadServ.buscarNombreRanking();
		for (UniversidadDTO universidadDTO : universidadDTOs) {
			System.out.println(universidadDTO);
		}
		
	*/	
		/*
		List<Universidad> list =this.universidadServ.buscarporNombre();
		for (Universidad universidad : list) {
			System.out.println(universidad);
		}
*/
		/*
		List<Universidad> list2 =this.universidadServ.buscarporRanking();
		for (Universidad universidad : list2) {
			System.out.println(universidad.getRanking());
		}
		*/
		
		
		System.out.println("right");
		List<Universidad> list3 =this.universidadServ.buscarporNombreRight();
		for (Universidad universidad : list3) {

				System.out.println(universidad);
				}			
				
			
		
		
		/*
		System.out.println("left");
		List<Universidad> list4 =this.universidadServ.buscarporNombreLeft();
		for (Universidad universidad4 : list4) {

			System.out.println(universidad4);
		}
		
		System.out.println("full");
		List<Universidad> list5 =this.universidadServ.buscarporNombreLeft();
		for (Universidad universidad5 : list5) {

			System.out.println(universidad5);
		}
		
		System.out.println("fetch");
		List<Universidad> list6 =this.universidadServ.buscarporNombreLeft();
		for (Universidad universidad6 : list6) {

			System.out.println(universidad6);
		}
		*/
}

}
