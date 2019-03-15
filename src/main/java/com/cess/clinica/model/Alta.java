package com.cess.clinica.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="alta")
public class Alta implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_alta;
	
	@ManyToOne
	@JoinColumn(name="id_internacion")
	private Internacion id_internacion;
	
	private Date fecha_salida;
	private double abono;
	
	public int getId_alta() {
		return id_alta;
	}
	public void setId_alta(int id_alta) {
		this.id_alta = id_alta;
	}
	public Internacion getId_internacion() {
		return id_internacion;
	}
	public void setId_internacion(Internacion id_internacion) {
		this.id_internacion = id_internacion;
	}
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public double getAbono() {
		return abono;
	}
	public void setAbono(double abono) {
		this.abono = abono;
	}
	
	
}
