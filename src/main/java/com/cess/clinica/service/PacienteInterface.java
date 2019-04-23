package com.cess.clinica.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cess.clinica.model.Paciente;


public interface PacienteInterface{
	Page<Paciente> findAll(Pageable pageable);
	List<Paciente> findAll();
	void save(Paciente p);
	Paciente findByNumDocumento(String numDocumento);
	void delete(int id);
	Paciente findById(int id);
	void update(Paciente p);
}
