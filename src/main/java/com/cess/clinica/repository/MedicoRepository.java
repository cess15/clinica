package com.cess.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cess.clinica.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Integer> {
	Medico findByNumDocumento(String numDocumento);
}
