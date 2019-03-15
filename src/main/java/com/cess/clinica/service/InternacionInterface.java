package com.cess.clinica.service;

import java.util.List;

import com.cess.clinica.model.Internacion;

public interface InternacionInterface{
	List<Internacion> findAll();
	void save(Internacion i);
	Internacion findById(int id);
}
