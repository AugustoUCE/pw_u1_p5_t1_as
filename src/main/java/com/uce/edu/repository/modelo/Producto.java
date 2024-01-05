package com.uce.edu.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_producto")
	@SequenceGenerator(name = "seq_producto", sequenceName = "seq_producto", allocationSize = 1)
	@Column(name = "pro_id")
	private Integer id;

	@Column(name = "pro_nombre")
	private String nombre;
	@Column(name = "pro_categoria")
	private String categoria;
	@Column(name = "pro_precio")
	private BigDecimal precio;
	@Column(name = "pro_peso")
	private Double peso;

	@OneToOne(mappedBy = "producto", cascade = CascadeType.ALL)
	private Informe informe;

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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Informe getInforme() {
		return informe;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ ", peso=" + peso + ", informe=" + informe + "]";
	}

}
