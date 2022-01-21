package com.proyect.fudtec.main.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Embeddable
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class VentaComidaKey  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Column(name = "venta_id")
	Long venta_id;

	@Column(name = "comida_id")
	Long comida_id;
	
}
