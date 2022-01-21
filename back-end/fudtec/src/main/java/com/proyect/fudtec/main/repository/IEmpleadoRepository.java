package com.proyect.fudtec.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyect.fudtec.main.model.Categoria;
import com.proyect.fudtec.main.model.Empleado;
import com.proyect.fudtec.main.model.TipoCuenta;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado, Long>{

}
