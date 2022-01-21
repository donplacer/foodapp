package com.proyect.fudtec.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.fudtec.main.model.Categoria;
import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Cuenta;
import com.proyect.fudtec.main.service.IComidaService;
import com.proyect.fudtec.main.service.ICuentaService;
import com.proyect.fudtec.main.service.ICategoriaService;
import com.proyect.fudtec.main.service.impl.CategoriaServiceImpl;

@RestController
@RequestMapping(value = "/api/cuenta")
@CrossOrigin(origins = "http://localhost:4200")
public class CuentaController {

	
	@Autowired
	private ICuentaService cuentaService;

	@GetMapping
	public List<Cuenta> findAll() {

		return cuentaService.listadoCuenta();
	}
	
}
