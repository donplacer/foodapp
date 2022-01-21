package com.proyect.fudtec.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.fudtec.main.model.Cuenta;
import com.proyect.fudtec.main.model.TipoCuenta;

@Repository
public interface ICuentaRepository extends CrudRepository<Cuenta, Long>{

}
