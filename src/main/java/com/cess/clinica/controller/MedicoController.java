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

import com.cess.clinica.model.Medico;
import com.cess.clinica.service.MedicoInterface;
import com.cess.clinica.util.Response;

@RestController
@RequestMapping(value="/api")
public class MedicoController {
	
	@Autowired
	private MedicoInterface medicoService;
	
	@GetMapping(value="/medico",produces="application/json")
	public ResponseEntity<?> findAll(){
		return new ResponseEntity<>(medicoService.findAll(),HttpStatus.OK);
	}
	
	@PostMapping(value="/medico",produces="application/json")
	public ResponseEntity<?> save(@RequestBody Medico m){
		Medico medico = medicoService.findByNumDocumento(m.getNumDocumento());
		if(medico!=null) {
			return new ResponseEntity<>(new Response("Medico "+medico.getNombre()+" "+medico.getApellido()+" con numero documento "+m.getNumDocumento()+" ya se encuentra registrado"),HttpStatus.CONFLICT);
		}
		medicoService.save(m);
		return new ResponseEntity<>(new Response("Medico "+m.getNombre()+" "+m.getApellido()+" ingresado"),HttpStatus.OK);
	}
	
	@PutMapping(value="/medico/{id}",produces="application/json")
	public ResponseEntity<Response> update(@PathVariable("id") int id,@RequestBody Medico m){
		Medico medico = medicoService.findById(id);
		if(medico==null) {
			return new ResponseEntity<Response>(new Response("Error: no existe el medico"),HttpStatus.NOT_FOUND);
		}
		m.setId(id);
		medicoService.save(m);
		return new ResponseEntity<Response>(new Response("Se ha modificado los datos del medico"),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/medico/{id}",produces="application/json")
	public ResponseEntity<?> delete(@PathVariable("id") int id){
		Medico medico=medicoService.findById(id);
		if(medico==null) {
			return new ResponseEntity<Response>(new Response("Error: no existe el medico"),HttpStatus.NOT_FOUND);
		}
		medicoService.delete(id);
		return new ResponseEntity<Response>(new Response("Medicoe "+medico.getNombre()+" "+medico.getApellido()+" eliminado"),HttpStatus.OK);
	}
}
