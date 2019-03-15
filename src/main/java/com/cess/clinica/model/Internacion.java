package com.cess.clinica.model;

import java.io.Serializable;
import java.util.Date;

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
	private int id_internacion;
	
	@ManyToOne
	@JoinColumn(name="id_paciente")
	@JsonIgnoreProperties("internaciones")
	private Paciente id_paciente;
	
	@ManyToOne
	@JoinColumn(name="id_medico")
	private Medico id_medico;
	
	@ManyToOne
	@JoinColumn(name="id_habitacion")
	private Habitacion id_habitacion;
	
	@ManyToOne
	@JoinColumn(name="id_estado_int")
	private EstadoInternacion id_estado_int;
	
	private String motivo;
	private Date fecha_internacion;
	
	public int getId_internacion() {
		return id_internacion;
	}
	public void setId_internacion(int id_internacion) {
		this.id_internacion = id_internacion;
	}
	public Paciente getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(Paciente id_paciente) {
		this.id_paciente = id_paciente;
	}
	public Medico getId_medico() {
		return id_medico;
	}
	public void setId_medico(Medico id_medico) {
		this.id_medico = id_medico;
	}
	public Habitacion getId_habitacion() {
		return id_habitacion;
	}
	public void setId_habitacion(Habitacion id_habitacion) {
		this.id_habitacion = id_habitacion;
	}
	public EstadoInternacion getId_estado_int() {
		return id_estado_int;
	}
	public void setId_estado_int(EstadoInternacion id_estado_int) {
		this.id_estado_int = id_estado_int;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getFecha_internacion() {
		return fecha_internacion;
	}
	public void setFecha_internacion(Date fecha_internacion) {
		this.fecha_internacion = fecha_internacion;
	}
	
	
}
