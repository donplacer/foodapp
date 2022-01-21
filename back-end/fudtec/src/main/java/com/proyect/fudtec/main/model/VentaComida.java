package com.proyect.fudtec.main.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "venta_comida")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class VentaComida {

	
	
	@EmbeddedId
	VentaComidaKey id;
	
	
	@ManyToOne
	@MapsId("id")
	@JoinColumn(name = "venta_id")
	Venta venta;
	
	@ManyToOne
	@MapsId("id")
	@JoinColumn(name = "comida_id")
	Comida comida;
	
	boolean cantidad;
	
}
