package com.cess.clinica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cess.clinica.model.Paciente;
import com.cess.clinica.service.PacienteInterface;
import com.cess.clinica.util.Response;

@RestController
@RequestMapping(value="/api")
public class PacienteController {
	
	@Autowired
	private PacienteInterface pacienteService;
	
	@GetMapping(value="/paciente",produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(pacienteService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(value="/paciente",produces="application/json")
	public ResponseEntity<?> save(@RequestBody Paciente p){
		Paciente paciente = pacienteService.findByNumDocumento(p.getNumDocumento());
		if(paciente!=null) {
			return new ResponseEntity<>(new Response("Paciente "+paciente.getNombre()+" "+paciente.getApellido()+" con el numero de documento "+p.getNumDocumento()+" ya se encuentra registrado"),HttpStatus.CONFLICT);
		}
		pacienteService.save(p);
		return new ResponseEntity<>(new Response("Paciente "+p.getNombre()+" "+p.getApellido()+" ingresado"),HttpStatus.OK);			
	}
	
	@DeleteMapping(value="/paciente/{id}",produces="application/json")
	public ResponseEntity<Response> delete(@PathVariable("id") int id){
		Paciente paciente=pacienteService.findById(id);
		if(paciente==null) {
			return new ResponseEntity<Response>(new Response("Error: no existe el paciente"),HttpStatus.NOT_FOUND);
		}
		pacienteService.delete(id);
		return new ResponseEntity<Response>(new Response("Paciente "+paciente.getNombre()+" "+paciente.getApellido()+" eliminado"),HttpStatus.OK);
	}
	
	@PutMapping(value="/paciente/{id}",produces="application/json")
	public ResponseEntity<Response> update(@PathVariable("id") int id,@RequestBody Paciente p){
		Paciente paciente = pacienteService.findById(id);
		if(paciente==null) {
			return new ResponseEntity<Response>(new Response("Error: no existe el paciente"),HttpStatus.NOT_FOUND);
		}
		p.setId(id);
		pacienteService.save(p);
		return new ResponseEntity<Response>(new Response("Se ha modificado los datos del paciente"),HttpStatus.OK);
	}
	
	@GetMapping(value="/paciente/{id}",produces="application/json")
	public ResponseEntity<?> findById(@PathVariable("id") int id){
		Paciente paciente = pacienteService.findById(id);
		if(paciente==null) {
			return new ResponseEntity<>(new Response("Error: no existe el paciente"),HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(paciente,HttpStatus.OK);
	}
}
