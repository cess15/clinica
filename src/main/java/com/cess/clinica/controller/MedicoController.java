package com.cess.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.service.MedicoInterface;

@RestController
@RequestMapping(value="/api")
public class MedicoController {
	
	@Autowired
	private MedicoInterface medicoService;
	
<<<<<<< HEAD
	@GetMapping(value="/medico",produces="application/json")
=======
	@GetMapping(value= "/medico",produces="application/json")
>>>>>>> 45e9bb61494de603ed1febbef4d606030f2ce3e1
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(medicoService.findAll(),HttpStatus.OK);
	}
}
