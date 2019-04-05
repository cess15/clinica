package com.cess.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	@GetMapping(value="/habitacion/{id}",produces="application/json")
	public ResponseEntity<?> findByEstadoHabitacion(@PathVariable("id") int id){
		if(id==1) {
			EstadoHabitacion estado = new EstadoHabitacion();
			estado.setId(id);
			List<Habitacion> habitacion = habitacionService.findByEstadoHabitacion(estado);
			return new ResponseEntity<>(habitacion,HttpStatus.OK);
		}
		else if(id==2) {
			EstadoHabitacion estado = new EstadoHabitacion();
			estado.setId(id);
			List<Habitacion> habitacion = habitacionService.findByEstadoHabitacion(estado);
			return new ResponseEntity<>(habitacion,HttpStatus.OK);
		}
		return new ResponseEntity<>(new Response("Error"),HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/habitacion",produces="application/json")
	public ResponseEntity<?> save(@RequestBody Habitacion h){
		habitacionService.save(h);
		return new ResponseEntity<>(new Response("Habitacion ingresada"),HttpStatus.OK);
	}
	
	@PutMapping(value="/habitacion/{id}",produces="application/json")
	public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Habitacion h){
		Habitacion habitacion = habitacionService.findById(id);
		if(habitacion==null) {
			return new ResponseEntity<>(new Response("Error: habitacion no existe"),HttpStatus.NOT_FOUND);
		}
		h.setId(id);
		habitacionService.update(h);
		return new ResponseEntity<>(new Response("Se ha modificado los datos de la habitacion"),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/habitacion/{id}",produces="application/json")
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		Habitacion habitacion = habitacionService.findById(id);
		if(habitacion==null) {
			return new ResponseEntity<Response>(new Response("Error: habitacion no existe"),HttpStatus.NOT_FOUND);
		}
		habitacionService.delete(id);
		return new ResponseEntity<Response>(new Response("Habitacion eliminada"),HttpStatus.OK);
	}
}
