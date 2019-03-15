package com.cess.clinica.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="genero")
public class Genero implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_genero;
	private String descripcion_g;
	
	public int getId_genero() {
		return id_genero;
	}
	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}
	public String getDescripcion_g() {
		return descripcion_g;
	}
	public void setDescripcion_g(String descripcion_g) {
		this.descripcion_g = descripcion_g;
	}
	
	
}
