package com.cess.clinica.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Piso;

public interface HabitacionInterface{
	List<Habitacion> findAll();
	Page<Habitacion> findAll(Pageable pageable);
	Habitacion findById(int id);
	void save(Habitacion h);
	void update(Habitacion h);
	Page<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion,Pageable pageable);
	List<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion);
	Habitacion findByPisoAndNumero(Piso piso,String numero);
	void delete(int id);
}
