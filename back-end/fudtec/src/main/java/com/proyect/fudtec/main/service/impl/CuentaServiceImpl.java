package com.proyect.fudtec.main.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Cuenta;
import com.proyect.fudtec.main.model.Mesa;
import com.proyect.fudtec.main.repository.IComidaRepository;
import com.proyect.fudtec.main.repository.ICuentaRepository;
import com.proyect.fudtec.main.repository.IMesaRespository;
import com.proyect.fudtec.main.service.ICuentaService;
import com.proyect.fudtec.main.service.IMesaService;

@Service
public class CuentaServiceImpl implements ICuentaService{

	@Autowired
	private ICuentaRepository cuentaRepository;
	
	@Override
	public ArrayList<Cuenta> listadoCuenta() {
		// TODO Auto-generated method stub
		return (ArrayList<Cuenta>)cuentaRepository.findAll();
	}

	
}
