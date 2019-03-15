package com.cess.clinica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="piso")
public class Piso implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_piso;
	private String descripcion_piso;
	
	public int getId_piso() {
		return id_piso;
	}
	public void setId_piso(int id_piso) {
		this.id_piso = id_piso;
	}
	public String getDescripcion_piso() {
		return descripcion_piso;
	}
	public void setDescripcion_piso(String descripcion_piso) {
		this.descripcion_piso = descripcion_piso;
	}
	
	
}
