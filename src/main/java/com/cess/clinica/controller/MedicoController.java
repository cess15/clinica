package com.cess.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.Medico;
import com.cess.clinica.service.MedicoInterface;

@RestController
@RequestMapping(value="/api")
public class MedicoController {
	
	@Autowired
	private MedicoInterface medicoService;
	
	@GetMapping(value= "/medico",produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(medicoService.findAll(),HttpStatus.OK);
	}
}
