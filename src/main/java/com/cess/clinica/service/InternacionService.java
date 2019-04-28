package com.cess.clinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cess.clinica.model.Internacion;
import com.cess.clinica.repository.InternacionRepository;

@Service
public class InternacionService implements InternacionInterface{

	@Autowired
	private InternacionRepository internacionRepository;
	
	@Override
	public List<Internacion> findAll() {
		return internacionRepository.findAll();
	}

	@Override
	public void save(Internacion i) {
		internacionRepository.save(i);
		
	}

	@Override
	public Internacion findById(int id) {
		Optional<Internacion> internacion=internacionRepository.findById(id);
		if(internacion.isPresent()) {
			return internacion.get();
		}
		return null;
	}

	@Override
	public Page<Internacion> findAll(Pageable pageable) {
		return internacionRepository.findAll(pageable);
	}

}
