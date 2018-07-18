package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
    @ResponseBody
	public List<Persona> listar(){
		return personaRepository.findAll();
	}
	
	
}
