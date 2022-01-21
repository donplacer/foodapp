package com.proyect.fudtec.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.fudtec.main.model.Comida;

@Repository
public interface IComidaRepository extends CrudRepository<Comida, Long>{

	
	
}
