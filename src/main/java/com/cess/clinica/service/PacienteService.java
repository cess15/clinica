package com.cess.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cess.clinica.model.Paciente;
import com.cess.clinica.repository.PacienteRepository;

@Service
public class PacienteService implements PacienteInterface{

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}

}
