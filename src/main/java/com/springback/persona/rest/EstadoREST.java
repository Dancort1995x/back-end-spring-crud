package com.springback.persona.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springback.persona.model.Estado;
import com.springback.persona.service.EstadoService;

@RestController
@RequestMapping("/estados/")
public class EstadoREST {
	
	@Autowired
	EstadoService estadoService;

	@GetMapping("{id}")
	private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") Long idPais){
		return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
	}
	
}
