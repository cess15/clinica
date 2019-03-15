package com.cess.clinica.service;

import java.util.List;

import com.cess.clinica.model.Alta;

public interface AltaInterface {
	
	List<Alta> findAll();
	void save(Alta a);
}
