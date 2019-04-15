package com.cess.clinica.service;

import java.util.List;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;

public interface HabitacionInterface{
	List<Habitacion> findAll();
	Habitacion findById(int id);
	void save(Habitacion h);
	void update(Habitacion h);
	List<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion);
	void delete(int id);
}
