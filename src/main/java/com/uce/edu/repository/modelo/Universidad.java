package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="universidad")
public class Universidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_universidad")
	@SequenceGenerator(name = "seq_universidad", sequenceName = "seq_universidad", allocationSize = 1)
	@Column(name="uni_id")
	private Integer id;
	@Column(name="uni_nombre")
	private String nombre;
	@Column(name="uni_ubicacion")
	private String ubicacion;
	@Column(name="uni_fundacion")
	private LocalDateTime fundacion;
	@Column(name="uni_tipo")
	private String tipo;
	@Column(name="uni_ranking")
	private String ranking;
	
	@OneToMany(mappedBy = "universidad",cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Estudiante> estudiantes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public LocalDateTime getFundacion() {
		return fundacion;
	}

	public void setFundacion(LocalDateTime fundacion) {
		this.fundacion = fundacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Universidad [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", fundacion=" + fundacion
				+ ", tipo=" + tipo + ", ranking=" + ranking+ "]";
				
				
				
				//+ ", \n estudiantes=" + estudiantes + "]";
	}


	
	

}
