package com.cess.clinica.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="paciente")
public class Paciente implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_paciente;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_doc")
	private TipoDocumento id_tipo_doc;
	
	private String apellido;
	private String nombre;
	private String num_documento;
	private String domicilio;
	private String obra_social;
	
	@OneToMany(mappedBy="id_paciente",fetch=FetchType.EAGER)
	@JsonIgnoreProperties("id_paciente")
	private Set<Internacion> internaciones;
	
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	public TipoDocumento getId_tipo_doc() {
		return id_tipo_doc;
	}
	
	public void setId_tipo_doc(TipoDocumento id_tipo_doc) {
		this.id_tipo_doc = id_tipo_doc;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNum_documento() {
		return num_documento;
	}
	public void setNum_documento(String num_documento) {
		this.num_documento = num_documento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getObra_social() {
		return obra_social;
	}
	public void setObra_social(String obra_social) {
		this.obra_social = obra_social;
	}
	public Set<Internacion> getInternaciones() {
		return internaciones;
	}
	public void setId_internacion(Set<Internacion> internaciones) {
		this.internaciones = internaciones;
	}
}
