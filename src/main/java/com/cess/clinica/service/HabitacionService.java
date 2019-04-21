package com.cess.clinica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Piso;
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

	@Override
	public List<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion) {
		List<Habitacion> habitacion = habitacionRepository.findByEstadoHabitacion(estadoHabitacion);
		if(habitacion!=null) {
			return habitacion;
		}
		return null;
	}

	@Override
	public void save(Habitacion h) {
		habitacionRepository.save(h);
	}

	@Override
	public void delete(int id) {
		habitacionRepository.deleteById(id);
		
	}

	@Override
	public List<Habitacion> findAll() {
		List<Habitacion> habitacion = habitacionRepository.findAll();
		if(habitacion!=null) {
			return habitacion;
		}
		return null;
	}

	@Override
	public Habitacion findByPisoAndNumero(Piso piso,String numero) {
		Habitacion habitacion = habitacionRepository.findByPisoAndNumero(piso,numero);
		if(habitacion!=null) {
			return habitacion;
		}
		return null;
	}
}
