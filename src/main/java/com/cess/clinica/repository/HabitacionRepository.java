package com.cess.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{
	List<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion);
}
