package com.cess.clinica.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cess.clinica.model.Internacion;

public interface InternacionInterface{
	List<Internacion> findAll();
	Page<Internacion> findAll(Pageable pageable);
	void save(Internacion i);
	Internacion findById(int id);
}
