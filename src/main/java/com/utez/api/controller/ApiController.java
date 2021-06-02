package com.utez.api.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.utez.api.entity.Persona;
import com.utez.api.repository.Repository;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
@RestController
@RequestMapping("/app")
public class ApiController {
	List<Persona> lista = new ArrayList<Persona>();
	
	@Autowired
	private Repository repositorio;

	@GetMapping("/getAll")
	public List<Persona> getAllPersona(){
		return repositorio.findAll();
	}
	
	@PostMapping("/register")
	public String register(@RequestBody Persona persona) {
		repositorio.save(persona);
		return "Registro exitoso!";
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Persona persona) {
		repositorio.save(persona);
		return "Actualizacion exitoso!";
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete (@PathVariable("id") long id) {
		repositorio.deleteById(id);
		return "Se eleimino con exito";
	}

}
