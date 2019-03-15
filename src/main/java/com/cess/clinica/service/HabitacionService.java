package com.cess.clinica.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cess.clinica.model.Habitacion;
import com.cess.clinica.repository.HabitacionRepository;

@Service
public class HabitacionService implements HabitacionInterface {

	@Autowired
	HabitacionRepository habitacionRepository;
	
	@Override
	public Habitacion findById(int id) {
		Optional<Habitacion> habitacion=habitacionRepository.findById(id);
		if(habitacion.isPresent()) {
			return habitacion.get();
		}
		return null;
	}

	@Override
	public void update(Habitacion h) {
		habitacionRepository.save(h);
	}

}
