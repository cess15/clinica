package com.cess.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cess.clinica.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
	
}
