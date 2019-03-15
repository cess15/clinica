package com.cess.clinica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="habitacion")
public class Habitacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_habitacion;
	
	@ManyToOne
	@JoinColumn(name="id_piso")
	private Piso id_piso;
	
	@ManyToOne
	@JoinColumn(name="id_estado_hab")
	private EstadoHabitacion id_estado_hab;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_hab")
	private TipoHabitacion id_tipo_hab;
	
	@ManyToOne
	@JoinColumn(name="id_genero")
	private Genero id_genero;
	
	private String numero;
	
	public int getId_habitacion() {
		return id_habitacion;
	}
	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}
	public Piso getId_piso() {
		return id_piso;
	}
	public void setId_piso(Piso id_piso) {
		this.id_piso = id_piso;
	}
	public EstadoHabitacion getId_estado_hab() {
		return id_estado_hab;
	}
	public void setId_estado_hab(EstadoHabitacion id_estado_hab) {
		this.id_estado_hab = id_estado_hab;
	}
	public TipoHabitacion getId_tipo_hab() {
		return id_tipo_hab;
	}
	public void setId_tipo_hab(TipoHabitacion id_tipo_hab) {
		this.id_tipo_hab = id_tipo_hab;
	}
	public Genero getId_genero() {
		return id_genero;
	}
	public void setId_genero(Genero id_genero) {
		this.id_genero = id_genero;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
