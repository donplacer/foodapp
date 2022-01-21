package com.proyect.fudtec.main.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "mesa")
@Getter
@Setter
@NoArgsConstructor
public class Mesa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "mesa")
	@JsonIgnoreProperties(value={"mesa", "hibernateLazyInitializer", "handler"})
	private List<Venta> ventas;
}
