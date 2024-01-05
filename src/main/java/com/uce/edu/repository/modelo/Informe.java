package com.uce.edu.repository.modelo;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="informe")
public class Informe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_informe")
	@SequenceGenerator(name = "seq_informe", sequenceName = "seq_informe", allocationSize = 1)
	@Column(name="inf_id")
	private Integer id;
	@Column(name="inf_numeroSerie")
	private String numeroSerie;
	@Column(name="inf_normativa")
	private String normativa;
	@Column(name="inf_garantia")
	private String garantia;
	@Column(name="inf_fechaFabricacion")
	private LocalDateTime fechaFabricacion;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="inf_id_pro")
	private Producto producto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getNormativa() {
		return normativa;
	}

	public void setNormativa(String normativa) {
		this.normativa = normativa;
	}

	public String getGarantia() {
		return garantia;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public LocalDateTime getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(LocalDateTime fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Informe [id=" + id + ", numeroSerie=" + numeroSerie + ", normativa=" + normativa + ", garantia="
				+ garantia + ", fechaFabricacion=" + fechaFabricacion + ", producto=" + producto + "]";
	}
	
	
	
	
	
	
	

}
