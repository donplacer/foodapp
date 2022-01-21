package com.proyect.fudtec.main.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity(name = "venta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private Date fechaVenta;
	
	@Column
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value={"ventas","cuenta", "hibernateLazyInitializer", "handler"})
	private Empleado empleado;
	
	
	
	@OneToMany(fetch = FetchType.LAZY)
	List<VentaComida> ventaComida;
	
	@ManyToOne(fetch =FetchType.LAZY )
	@JsonIgnoreProperties(value={"ventas", "hibernateLazyInitializer", "handler"})
	 Mesa mesa;
	
}
