package com.uce.edu.ec.repository.modelo;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso")
	@SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso", allocationSize = 1)
	@Column(name = "cur_id")
	private Integer id;
	@Column(name = "cur_nombre")
	private String nombre;
	@Column(name = "cur_semestre")
	private String semestre;
	@Column(name = "cur_fecha_inicio")
	private LocalDateTime fechaInicio;
	@Column(name = "cur_fecha_finalizacion")
	private LocalDateTime fechaFinalizacion;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="estudiante_curso",
	joinColumns = @JoinColumn(name = "estucurso_id_curso"), 
	inverseJoinColumns = @JoinColumn(name = "estucurso_id_estudiante"))
	private Set<Estudiante> estudiantes;

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

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(LocalDateTime fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public Set<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", nombre=" + nombre + ", semestre=" + semestre + ", fechaInicio=" + fechaInicio
				+ ", fechaFinalizacion=" + fechaFinalizacion + ", estudiantes=" + estudiantes + "]";
	}

}
