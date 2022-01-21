package com.proyect.fudtec.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.service.IComidaService;



@RestController
@RequestMapping(value = "/api/comida")
@CrossOrigin(origins = "http://localhost:4200")
public class ComidaController {

	@Autowired
	private IComidaService comidaService;

	@GetMapping
	public List<Comida> findAll() {

		return comidaService.listadoComida();
	}
	
}
