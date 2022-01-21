package com.proyect.fudtec.main.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.repository.IComidaRepository;
import com.proyect.fudtec.main.service.IComidaService;


@Service
public class ComidaServiceImpl implements IComidaService{

	
	@Autowired
	private IComidaRepository comidarepository;
	
	@Override
	public ArrayList<Comida> listadoComida() {
		// TODO Auto-generated method stub
		return (ArrayList<Comida>)comidarepository.findAll();
	}

}
