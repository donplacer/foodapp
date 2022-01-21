package com.proyect.fudtec.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Venta;
import com.proyect.fudtec.main.service.IComidaService;
import com.proyect.fudtec.main.service.IVentaService;



@RestController
@RequestMapping(value = "/api/venta")
@CrossOrigin(origins = "http://localhost:4200")
public class VentaRepository {

	@Autowired
	private IVentaService ventaService;

	@GetMapping
	public List<Venta> findAll() {

		return ventaService.listadoVentas();
	}
	
}
