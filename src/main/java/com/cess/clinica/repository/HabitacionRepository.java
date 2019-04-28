package com.cess.clinica.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Piso;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{
	Page<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion, Pageable pageable);
	List<Habitacion> findByEstadoHabitacion(EstadoHabitacion estadoHabitacion);
	Habitacion findByPisoAndNumero(Piso piso, String numero);
}
