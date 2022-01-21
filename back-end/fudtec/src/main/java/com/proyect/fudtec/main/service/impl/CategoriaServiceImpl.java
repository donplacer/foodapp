package com.proyect.fudtec.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.fudtec.main.model.Categoria;
import com.proyect.fudtec.main.repository.ICategoriaRepository;
import com.proyect.fudtec.main.service.ICategoriaService;

@Service
public class CategoriaServiceImpl implements ICategoriaService{

	@Autowired
	private ICategoriaRepository icategoriarepository;
	
	@Override
	public List<Categoria> listadoCategoria() {
		// TODO Auto-generated method stub
		return (List<Categoria>)icategoriarepository.findAll();
	}

}
