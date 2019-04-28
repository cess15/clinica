package com.cess.clinica.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cess.clinica.model.Medico;

public interface MedicoInterface {
	List<Medico> findAll();
	Page<Medico> findAll(Pageable pageable);
	void save(Medico m);
	Medico findByNumDocumento(String numDocumento);
	void update(Medico m);
	Medico findById(int id);
	void delete(int id);
}
