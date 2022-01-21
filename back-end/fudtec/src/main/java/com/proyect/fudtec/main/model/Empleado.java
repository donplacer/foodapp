package com.proyect.fudtec.main.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "empleado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@OneToMany(mappedBy = "empleado")
	@JsonIgnoreProperties(value= {"empleado"})
	List<Venta> ventas;
	
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnoreProperties(value={"emple", "hibernateLazyInitializer", "handler"})
	private Cuenta cuenta;
	

	
}
