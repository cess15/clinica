package com.cess.clinica.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="estado_internacion")
public class EstadoInternacion implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_estado_int;
	
	private String descripcion;
	
	/*@OneToMany(mappedBy="id_estado_int",fetch=FetchType.EAGER)
	private Set<Internacion> internaciones;*/
	
	public int getId_estado_int() {
		return id_estado_int;
	}
	public void setId_estado_int(int id_estado_int) {
		this.id_estado_int = id_estado_int;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/*public Set<Internacion> getInternaciones() {
		return internaciones;
	}
	public void setInternaciones(Set<Internacion> internaciones) {
		this.internaciones = internaciones;
	}
	*/
	
	
}
