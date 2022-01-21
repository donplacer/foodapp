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
import com.proyect.fudtec.main.model.TipoCuenta;
import com.proyect.fudtec.main.service.IComidaService;
import com.proyect.fudtec.main.service.ITipoCuentaService;
import com.proyect.fudtec.main.service.ICategoriaService;
import com.proyect.fudtec.main.service.impl.CategoriaServiceImpl;

@RestController
@RequestMapping(value = "/api/tipocuenta")
@CrossOrigin(origins = "http://localhost:4200")
public class TipoCuentaController {

	
	@Autowired
	private ITipoCuentaService cuentaService;

	@GetMapping
	public List<TipoCuenta> findAll() {

		return cuentaService.listadoTipoCuenta();
	}
	
}
