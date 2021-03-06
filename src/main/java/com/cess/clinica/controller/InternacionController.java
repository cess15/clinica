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

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.EstadoInternacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.model.Internacion;
import com.cess.clinica.model.Medico;
import com.cess.clinica.model.Paciente;
import com.cess.clinica.service.HabitacionInterface;
import com.cess.clinica.service.InternacionInterface;
import com.cess.clinica.service.MedicoInterface;
import com.cess.clinica.service.PacienteInterface;
import com.cess.clinica.util.Response;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class InternacionController {
	
	@Autowired
	private InternacionInterface internacionService;
	
	@Autowired
	private HabitacionInterface habitacionService;
	
	@Autowired
	private MedicoInterface medicoService;
	
	@Autowired
	private PacienteInterface pacienteService;
	
	@GetMapping(value="/internaciones", produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(internacionService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(value="/internacion", produces="application/json")
	public ResponseEntity<?> findAll(@PageableDefault(size=10) Pageable pageable){
		return new ResponseEntity<>(internacionService.findAll(pageable),HttpStatus.OK);
	}
	
	@PostMapping(value="/internacion", produces="application/json")
	public ResponseEntity<?> save(@RequestBody Internacion internacion){
		Habitacion habitacion=habitacionService.findById(internacion.getHabitacion().getId());
		Medico medico = medicoService.findById(internacion.getMedico().getId());
		Paciente paciente = pacienteService.findById(internacion.getPaciente().getId());
		
		if(paciente==null) {
			return new ResponseEntity<>(new Response("No se encontro al paciente"),HttpStatus.NOT_FOUND);
		}else if(medico==null) {
			return new ResponseEntity<>(new Response("No se encontro al médico"),HttpStatus.NOT_FOUND);
		}else if(habitacion==null) {
			return new ResponseEntity<>(new Response("No se encontro la habitación"),HttpStatus.NOT_FOUND);
		}
		
		if(paciente.isEstaInternado()==true) {
			return new ResponseEntity<>(new Response("El paciente ya tiene una internación en progreso"),HttpStatus.CONFLICT);
		}
		
		if(habitacion.isHayPaciente()==true) {
			return new ResponseEntity<>(new Response("Ya se encuentra un paciente en esa habitación o no esta disponible"),HttpStatus.CONFLICT);
		}
		EstadoInternacion estadoI = new EstadoInternacion();
		estadoI.setId(1);
		internacion.setEstadoInternacion(estadoI);
		internacionService.save(internacion);
		
		paciente.setMedico(medico);
		paciente.setEstaInternado(true);
		pacienteService.update(paciente);
		
		EstadoHabitacion estadoH=new EstadoHabitacion();
		estadoH.setId(2);
		habitacion.setEstadoHabitacion(estadoH);
		habitacion.setHayPaciente(true);
		habitacionService.update(habitacion);
		
		return new ResponseEntity<>(new Response("Paciente internado !!"),HttpStatus.CREATED);
	}
}
