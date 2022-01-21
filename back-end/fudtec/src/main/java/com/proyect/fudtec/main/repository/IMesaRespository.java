package com.proyect.fudtec.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.fudtec.main.model.Mesa;

@Repository
public interface IMesaRespository extends CrudRepository<Mesa, Long> {

}
