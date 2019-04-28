package com.cess.clinica.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cess.clinica.model.Alta;

public interface AltaInterface {
	
	List<Alta> findAll();
	Page<Alta> findAll(Pageable pageable);
	void save(Alta a);
}
