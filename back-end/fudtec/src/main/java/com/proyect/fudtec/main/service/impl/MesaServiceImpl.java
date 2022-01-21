package com.proyect.fudtec.main.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Mesa;
import com.proyect.fudtec.main.repository.IComidaRepository;
import com.proyect.fudtec.main.repository.IMesaRespository;
import com.proyect.fudtec.main.service.IMesaService;

@Service
public class MesaServiceImpl implements IMesaService{

	@Autowired
	private IMesaRespository mesaRepository;
	
	@Override
	public ArrayList<Mesa> listadoMesa() {
		// TODO Auto-generated method stub
		return (ArrayList<Mesa>)mesaRepository.findAll();
	}

	
}
