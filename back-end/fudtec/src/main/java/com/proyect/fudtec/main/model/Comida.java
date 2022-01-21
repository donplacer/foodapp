package com.proyect.fudtec.main.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "comida")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comida implements Serializable{
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;

	@Column
	private String descripcion;

	@Column
	private double precio;

	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value={"comidas", "hibernateLazyInitializer", "handler"})
	Categoria categoria;

	@JsonIgnore
	@OneToMany(mappedBy = "comida")
	List<VentaComida> ventaComida;
	
	

	
}
