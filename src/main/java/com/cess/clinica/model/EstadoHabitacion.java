package com.cess.clinica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado_habitacion")
public class EstadoHabitacion implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_estado_hab;
	private String descripcion_est;
	
	public int getId_estado_hab() {
		return id_estado_hab;
	}
	public void setId_estado_hab(int id_estado_hab) {
		this.id_estado_hab = id_estado_hab;
	}
	public String getDescripcion_est() {
		return descripcion_est;
	}
	public void setDescripcion_est(String descripcion_est) {
		this.descripcion_est = descripcion_est;
	}
	
	
	
}
