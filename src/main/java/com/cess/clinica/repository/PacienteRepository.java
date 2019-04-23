package com.cess.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cess.clinica.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
	Paciente findByNumDocumento(String numDocumento);
}
