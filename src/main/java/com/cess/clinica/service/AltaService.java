package com.cess.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cess.clinica.model.Alta;
import com.cess.clinica.repository.AltaRepository;

@Service
public class AltaService implements AltaInterface{

	@Autowired
	private AltaRepository altaRepository;
	
	@Override
	public List<Alta> findAll() {
		return altaRepository.findAll();
	}

	@Override
	public void save(Alta a) {
		altaRepository.save(a);
		
	}
	
}
