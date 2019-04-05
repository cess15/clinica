package com.cess.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Internacion;
import com.cess.clinica.service.HabitacionInterface;
import com.cess.clinica.service.InternacionInterface;
import com.cess.clinica.util.Response;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class InternacionController {
	
	@Autowired
	private InternacionInterface internacionService;
	
	@Autowired
	private HabitacionInterface habitacionService;
	
	@GetMapping(value="/internacion", produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(internacionService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(value="/internacion", produces="application/json")
	public ResponseEntity<?> save(@RequestBody Internacion internacion){
		Habitacion habitacion=habitacionService.findById(internacion.getHabitacion().getId());
		
		if(habitacion.getEstadoHabitacion().getId() != 1) {
			return new ResponseEntity<>(new Response("Esa habitacion no esta disponible"),HttpStatus.CONFLICT);
		}
		internacionService.save(internacion);
		
		EstadoHabitacion estadoH=new EstadoHabitacion();
		estadoH.setId(2);
		habitacion.setEstadoHabitacion(estadoH);
		habitacionService.update(habitacion);
		
		return new ResponseEntity<>(new Response("Paciente internado !!"),HttpStatus.CREATED);
	}
}
