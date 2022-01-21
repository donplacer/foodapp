package com.proyect.fudtec.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Mesa;
import com.proyect.fudtec.main.service.IComidaService;
import com.proyect.fudtec.main.service.IMesaService;



@RestController
@RequestMapping(value = "/api/mesa")
@CrossOrigin(origins = "http://localhost:4200")
public class MesaController {

	@Autowired
	private IMesaService mesaService;

	@GetMapping
	public List<Mesa> findAll() {

		return mesaService.listadoMesa();
	}
	
}
