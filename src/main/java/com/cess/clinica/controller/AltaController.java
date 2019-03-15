package com.cess.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.Alta;
import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.EstadoInternacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Internacion;
import com.cess.clinica.service.AltaInterface;
import com.cess.clinica.service.HabitacionInterface;
import com.cess.clinica.service.InternacionInterface;
import com.cess.clinica.util.Response;

@RestController
@RequestMapping(value="/api")
public class AltaController {
	
	@Autowired
	private AltaInterface altaService;
	
	@Autowired
	private HabitacionInterface habitacionService;
	
	@Autowired
	private InternacionInterface internacionService;
	
	@GetMapping(value="/alta", produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(altaService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(value="/alta", produces="application/json")
	public ResponseEntity<?> save(@RequestBody Alta alta){
		Internacion internacion=internacionService.findById(alta.getId_internacion().getId_internacion());
		
		if(internacion.getId_habitacion().getId_estado_hab().getId_estado_hab()!=2) {
			return new ResponseEntity<>(new Response("Esa habitacion esta disponible"),HttpStatus.CONFLICT);
		}
		altaService.save(alta);
		
		Habitacion habitacion=habitacionService.findById(internacion.getId_habitacion().getId_habitacion());
		EstadoHabitacion estadoH=new EstadoHabitacion();
		estadoH.setId_estado_hab(1);
		
		habitacion.setId_estado_hab(estadoH);
		habitacionService.update(habitacion);
		
		EstadoInternacion estadoI=new EstadoInternacion();
		estadoI.setId_estado_int(2);
		internacion.setId_estado_int(estadoI);
		internacionService.save(internacion);
		
		return new ResponseEntity<>(new Response("Alta registrada"),HttpStatus.CREATED);

	}
}
