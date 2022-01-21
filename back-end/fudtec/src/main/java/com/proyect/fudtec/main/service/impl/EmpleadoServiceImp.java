package com.proyect.fudtec.main.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Comida;
import com.proyect.fudtec.main.model.Empleado;
import com.proyect.fudtec.main.model.Mesa;
import com.proyect.fudtec.main.repository.IComidaRepository;
import com.proyect.fudtec.main.repository.IEmpleadoRepository;
import com.proyect.fudtec.main.repository.IMesaRespository;
import com.proyect.fudtec.main.service.IEmpleadoService;
import com.proyect.fudtec.main.service.IMesaService;

@Service
public class EmpleadoServiceImp implements IEmpleadoService{

	@Autowired
	private IEmpleadoRepository empleadoRepository;
	
	@Override
	public ArrayList<Empleado> listadoEmpleado() {
		// TODO Auto-generated method stub
		return (ArrayList<Empleado>)empleadoRepository.findAll();
	}

	
}
