package com.uce.edu.repository.modelo.dto;

public class UniversidadDTO {
	
	private String nombre;
	private String ranking;
	
	
	public UniversidadDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UniversidadDTO(String nombre, String ranking) {
		super();
		this.nombre = nombre;
		this.ranking = ranking;
	}

	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRanking() {
		return ranking;
	}


	public void setRanking(String ranking) {
		this.ranking = ranking;
	}


	@Override
	public String toString() {
		return "UniversidadDTO [nombre=" + nombre + ", ranking=" + ranking + "]";
	}
	
	
	

}
