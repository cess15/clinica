package com.cess.clinica.service;

import java.util.List;

import com.cess.clinica.model.Paciente;


public interface PacienteInterface{
	List<Paciente> findAll();
	void save(Paciente p);
	Paciente findByNumDocumento(String numDocumento);
	void delete(int id);
	Paciente findById(int id);
	void update(Paciente p);
}
