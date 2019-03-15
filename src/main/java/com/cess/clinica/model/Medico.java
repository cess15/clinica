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


@Entity
@Table(name="medico")
public class Medico implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_medico;
	/*
	@OneToMany(mappedBy="id_paciente",fetch=FetchType.EAGER)
	private Set<Paciente> id_paciente;*/
	
	@ManyToOne
	@JoinColumn(name="id_tipo_doc")
	private TipoDocumento id_tipo_doc;
	private String num_matricula;
	private String apellido;
	private String nombre;
	private String num_documento;
	private String especialidad;
	private String num_telefono;
	private String num_celular;
	
	public int getId_medico() {
		return id_medico;
	}
	public void setId_medico(int id_medico) {
		this.id_medico = id_medico;
	}
	/*
	public Set<Paciente> getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(Set<Paciente> id_paciente) {
		this.id_paciente = id_paciente;
	}
	*/
	public TipoDocumento getId_tipo_doc() {
		return id_tipo_doc;
	}
	public void setId_tipo_doc(TipoDocumento id_tipo_doc) {
		this.id_tipo_doc = id_tipo_doc;
	}
	public String getNum_matricula() {
		return num_matricula;
	}
	public void setNum_matricula(String num_matricula) {
		this.num_matricula = num_matricula;
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
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNum_telefono() {
		return num_telefono;
	}
	public void setNum_telefono(String num_telefono) {
		this.num_telefono = num_telefono;
	}
	public String getNum_celular() {
		return num_celular;
	}
	public void setNum_celular(String num_celular) {
		this.num_celular = num_celular;
	}
	
	
}
