package com.cess.clinica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_documento")
public class TipoDocumento implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_tipo_doc;
	
	@Column(name="descripcion_tipo")
	private String descripcion_tipo;
	
	public int getId_tipo_doc() {
		return id_tipo_doc;
	}
	public void setId_tipo_doc(int id_tipo_doc) {
		this.id_tipo_doc = id_tipo_doc;
	}
	public String getDescripciontipo() {
		return descripcion_tipo;
	}
	public void setDescripciontipo(String descripcion_tipo) {
		this.descripcion_tipo = descripcion_tipo;
	}
}