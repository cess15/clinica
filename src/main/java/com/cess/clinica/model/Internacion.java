package com.cess.clinica.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="internacion")
public class Internacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="paciente_id")
	@JsonIgnoreProperties({"internaciones","medico"})
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="medico_id")
	@JsonIgnoreProperties({"internaciones","paciente"})
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="habitacion_id")
	private Habitacion habitacion;
	
	@ManyToOne
	@JoinColumn(name="estado_id")
	private EstadoInternacion estadoInternacion;
	
	private String motivo;
	
	@Column(name="fecha_internacion")
	private Date fechaInternacion;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public EstadoInternacion getEstadoInternacion() {
		return estadoInternacion;
	}
	public void setEstadoInternacion(EstadoInternacion estadoInternacion) {
		this.estadoInternacion = estadoInternacion;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getFechaInternacion() {
		return fechaInternacion;
	}
	public void setFechaInternacion(Date fechaInternacion) {
		this.fechaInternacion = fechaInternacion;
	}
}
