package com.proyect.fudtec.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ch.qos.logback.core.subst.Token.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "cuenta")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String usuario;
	
	@Column
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "cuenta")
	@JsonIgnoreProperties(value={"cuenta","ventas", "hibernateLazyInitializer", "handler"})
	private Empleado emple;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value={"cuentas", "hibernateLazyInitializer", "handler"})
	private TipoCuenta tipo;
	
	
}
