package com.proyect.fudtec.main.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity(name = "tipo_cuenta")
@Getter
@Setter
@NoArgsConstructor
public class TipoCuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@Column
	private String nombre;

	@OneToMany(mappedBy = "tipo")
	@JsonIgnoreProperties(value={"tipo", "hibernateLazyInitializer", "handler"})
	private List<Cuenta> cuentas;

}
