package com.cess.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.Alta;
import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.EstadoInternacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Internacion;
import com.cess.clinica.model.Paciente;
import com.cess.clinica.service.AltaInterface;
import com.cess.clinica.service.HabitacionInterface;
import com.cess.clinica.service.InternacionInterface;
import com.cess.clinica.service.PacienteInterface;
import com.cess.clinica.util.Response;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST})
@RequestMapping(value="/api")
public class AltaController {
	
	@Autowired
	private AltaInterface altaService;
	
	@Autowired
	private HabitacionInterface habitacionService;
	
	@Autowired
	private InternacionInterface internacionService;
	
	@Autowired
	private PacienteInterface pacienteService;
	
	@GetMapping(value="/altas", produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(altaService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(value="/alta", produces="application/json")
	public ResponseEntity<?> findAll(@PageableDefault(size=10) Pageable pageable){
		return new ResponseEntity<>(altaService.findAll(pageable),HttpStatus.OK);
	}
	
	@PostMapping(value="/alta", produces="application/json")
	public ResponseEntity<?> save(@RequestBody Alta alta){
		Internacion internacion=internacionService.findById(alta.getInternacion().getId());
		if(internacion==null) {
			return new ResponseEntity<>(new Response("Error datos no encontrados"),HttpStatus.NOT_FOUND);
		}
		Habitacion habitacion = habitacionService.findById(internacion.getHabitacion().getId());
		Paciente paciente = pacienteService.findById(internacion.getPaciente().getId());
		
		if(paciente.isEstaInternado()==false) {
			return new ResponseEntity<>(new Response("El paciente ya ha sido dado de alta"),HttpStatus.CONFLICT);
		}
		
		if(habitacion.isHayPaciente()==false) {
			return new ResponseEntity<>(new Response("No se encontro ningun paciente en la habitación"),HttpStatus.NOT_FOUND);
		}
		
		
		altaService.save(alta);
		
		paciente.setEstaInternado(false);
		pacienteService.update(paciente);
		
		EstadoHabitacion estadoH=new EstadoHabitacion();
		estadoH.setId(1);
		habitacion.setEstadoHabitacion(estadoH);
		habitacion.setHayPaciente(false);
		habitacionService.update(habitacion);
		
		EstadoInternacion estadoI=new EstadoInternacion();
		estadoI.setId(2);
		internacion.setEstadoInternacion(estadoI);
		internacionService.save(internacion);
		
		return new ResponseEntity<>(new Response("Se ha dado de alta al paciente: "+internacion.getPaciente().getNombre()+" "+internacion.getPaciente().getApellido()),HttpStatus.CREATED);

	}
}
