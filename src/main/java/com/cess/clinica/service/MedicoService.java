package com.cess.clinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cess.clinica.model.Medico;
import com.cess.clinica.repository.MedicoRepository;

@Service
public class MedicoService implements MedicoInterface{

	@Autowired
	private MedicoRepository medicoRepository;
	
	@Override
	public List<Medico> findAll() {
		return medicoRepository.findAll();
	}

	@Override
	public void save(Medico m) {
		medicoRepository.save(m);
	}

	@Override
	public Medico findByNumDocumento(String numDocumento) {
		Medico medico=medicoRepository.findByNumDocumento(numDocumento);
		if(medico!=null) {
			return medico;
		}
		return null;
	}

	@Override
	public void update(Medico m) {
		medicoRepository.save(m);
	}

	@Override
	public Medico findById(int id) {
		Optional<Medico> medico=medicoRepository.findById(id);
		if(medico.isPresent()) {
			return medico.get();
		}
		return null;
	}

	@Override
	public void delete(int id) {
		medicoRepository.deleteById(id);
	}

}
