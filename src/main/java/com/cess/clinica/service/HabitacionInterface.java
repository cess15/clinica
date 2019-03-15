package com.cess.clinica.service;

import com.cess.clinica.model.Habitacion;

public interface HabitacionInterface{
	Habitacion findById(int id);
	void update(Habitacion h);
}
