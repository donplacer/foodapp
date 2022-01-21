package com.proyect.fudtec.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect.fudtec.main.model.Categoria;
import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.service.IComidaService;
import com.proyect.fudtec.main.service.ICategoriaService;
import com.proyect.fudtec.main.service.impl.CategoriaServiceImpl;

@RestController
@RequestMapping(value = "/api/categoria")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {

	
	@Autowired
	private ICategoriaService categoriaService;

	@GetMapping
	public List<Categoria> findAll() {

		return categoriaService.listadoCategoria();
	}
	
}
