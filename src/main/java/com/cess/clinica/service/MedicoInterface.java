package com.cess.clinica.service;

import java.util.List;

import com.cess.clinica.model.Medico;

public interface MedicoInterface {
	List<Medico> findAll();
	void save(Medico m);
	Medico findByNumDocumento(String numDocumento);
	void update(Medico m);
	Medico findById(int id);
	void delete(int id);
}
