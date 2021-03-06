package com.cess.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.EstadoHabitacion;
import com.cess.clinica.model.Habitacion;
import com.cess.clinica.service.HabitacionInterface;
import com.cess.clinica.util.Response;

@RestController
@CrossOrigin(origins="*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping(value="/api")
public class HabitacionController {
	
	@Autowired
	private HabitacionInterface habitacionService;
	
	@GetMapping(value="/habitaciones",produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(habitacionService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(value="/habitacion",produces="application/json")
	public ResponseEntity<?> findAll(@PageableDefault(size=10) Pageable pageable){
		return new ResponseEntity<>(habitacionService.findAll(pageable),HttpStatus.OK);
	}
	
	@GetMapping(value="/habitaciones/estado/{id}",produces="application/json")
	public ResponseEntity<?> findByEstadoHabitacion(@PathVariable("id") int id){
		EstadoHabitacion estado = new EstadoHabitacion();
		if(id==1) {
			estado.setId(id);
			List<Habitacion> habitacion = habitacionService.findByEstadoHabitacion(estado);
			return new ResponseEntity<>(habitacion,HttpStatus.OK);
		}
		else if(id==2) {
			estado.setId(id);
			List<Habitacion> habitacion = habitacionService.findByEstadoHabitacion(estado);
			return new ResponseEntity<>(habitacion,HttpStatus.OK);
		}
		return new ResponseEntity<>(new Response("Error"),HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value="/habitacion/estado/{id}",produces="application/json")
	public ResponseEntity<?> findByEstadoHabitacion(@PathVariable("id") int id, @PageableDefault(size=10) Pageable pageable){
		EstadoHabitacion estado = new EstadoHabitacion();
		if(id==1) {
			estado.setId(id);
			Page<Habitacion> habitacion = habitacionService.findByEstadoHabitacion(estado,pageable);
			return new ResponseEntity<>(habitacion,HttpStatus.OK);
		}
		else if(id==2) {
			estado.setId(id);
			Page<Habitacion> habitacion = habitacionService.findByEstadoHabitacion(estado,pageable);
			return new ResponseEntity<>(habitacion,HttpStatus.OK);
		}
		return new ResponseEntity<>(new Response("Error"),HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value="/habitacion/{id}",produces="application/json")
	public ResponseEntity<?> findById(@PathVariable("id") int id){
		Habitacion habitacion = habitacionService.findById(id);
		if(habitacion==null) {
			return new ResponseEntity<Response>(new Response("Error: habitación no existe"),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(habitacion,HttpStatus.OK);
	}
	
	@PostMapping(value="/habitacion",produces="application/json")
	public ResponseEntity<?> save(@RequestBody Habitacion h){
		Habitacion habitacion = habitacionService.findByPisoAndNumero(h.getPiso(),h.getNumero());
		
		if(habitacion!=null) {
			return new ResponseEntity<>(new Response("Habitacion ya existe"),HttpStatus.CONFLICT);
		}
		h.setHayPaciente(false);
		habitacionService.save(h);
		return new ResponseEntity<>(new Response("Habitacion ingresada"),HttpStatus.OK);
	}
	
	@PutMapping(value="/habitacion/{id}",produces="application/json")
	public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Habitacion h){
		Habitacion habitacion = habitacionService.findById(id);
		if(habitacion==null) {
			return new ResponseEntity<>(new Response("Error: habitación no existe"),HttpStatus.NOT_FOUND);
		}
		
		h.setId(id);
		if(habitacion.getPiso().getId()==h.getPiso().getId() && habitacion.getNumero().equals(h.getNumero())) {
			h.setHayPaciente(habitacion.isHayPaciente());
			habitacionService.update(h);
			return new ResponseEntity<>(new Response("Se han modificado los datos de la habitación"),HttpStatus.OK);
		}
		
		Habitacion obtenerHabitacion = habitacionService.findByPisoAndNumero(h.getPiso(),h.getNumero());
		if(obtenerHabitacion!=null) {
			return new ResponseEntity<>(new Response("Habitacion ya existe"),HttpStatus.CONFLICT);
		}
		h.setHayPaciente(habitacion.isHayPaciente());
		habitacionService.update(h);
		return new ResponseEntity<>(new Response("Se han modificado los datos de la habitación"),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/habitacion/{id}",produces="application/json")
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		Habitacion habitacion = habitacionService.findById(id);
		if(habitacion==null) {
			return new ResponseEntity<Response>(new Response("Error: habitación no existe"),HttpStatus.NOT_FOUND);
		}
		
		if(habitacion.isHayPaciente()==true) {
			return new ResponseEntity<Response>(new Response("Hay un paciente internado en esta habitación"),HttpStatus.CONFLICT);
		}
		
		habitacionService.delete(id);
		return new ResponseEntity<Response>(new Response("Habitación eliminada"),HttpStatus.OK);
	}
}
