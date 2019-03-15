package com.cess.clinica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_habitacion")
public class TipoHabitacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_tipo_hab;
	private String descripcion_thab;
	
	public int getId_tipo_hab() {
		return id_tipo_hab;
	}
	public void setId_tipo_hab(int id_tipo_hab) {
		this.id_tipo_hab = id_tipo_hab;
	}
	public String getDescripcion_thab() {
		return descripcion_thab;
	}
	public void setDescripcion_thab(String descripcion_thab) {
		this.descripcion_thab = descripcion_thab;
	}
	
	
}
