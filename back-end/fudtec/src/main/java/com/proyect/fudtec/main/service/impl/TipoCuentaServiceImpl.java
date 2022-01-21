package com.proyect.fudtec.main.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Mesa;
import com.proyect.fudtec.main.model.TipoCuenta;
import com.proyect.fudtec.main.repository.IComidaRepository;
import com.proyect.fudtec.main.repository.IMesaRespository;
import com.proyect.fudtec.main.repository.ITipoCuentaRepository;
import com.proyect.fudtec.main.service.IMesaService;
import com.proyect.fudtec.main.service.ITipoCuentaService;

@Service
public class TipoCuentaServiceImpl implements ITipoCuentaService{

	@Autowired
	private ITipoCuentaRepository tipoCuentaRepository;
	
	@Override
	public ArrayList<TipoCuenta> listadoTipoCuenta() {
		// TODO Auto-generated method stub
		return (ArrayList<TipoCuenta>)tipoCuentaRepository.findAll();
	}

	
}
