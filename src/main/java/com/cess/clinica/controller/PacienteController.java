package com.cess.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.Paciente;
import com.cess.clinica.service.PacienteInterface;

@RestController
@RequestMapping(value="/api")
public class PacienteController {
	
	@Autowired
	private PacienteInterface pacienteInterface;
	
	@GetMapping(value="/paciente",produces="application/json")
	public ResponseEntity<List<Paciente>> findAll(){
		return new ResponseEntity<List<Paciente>>(pacienteInterface.findAll(),HttpStatus.OK);
	}
}
