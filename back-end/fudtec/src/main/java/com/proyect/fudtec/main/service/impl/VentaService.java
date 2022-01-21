package com.proyect.fudtec.main.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Venta;
import com.proyect.fudtec.main.repository.IComidaRepository;
import com.proyect.fudtec.main.repository.IVentaRepository;
import com.proyect.fudtec.main.service.IVentaService;

@Service
public class VentaService implements IVentaService{

	@Autowired
	private IVentaRepository ventaRepository;
	
	@Override
	public ArrayList<Venta> listadoVentas() {
		// TODO Auto-generated method stub
		return (ArrayList<Venta>)ventaRepository.findAll();
	}

	
}
