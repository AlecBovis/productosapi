package com.tecsup.productos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPersona")
	private Integer idPersona;
	
	@Column(name = "per_nombre")
	private String per_nombre;
	
	@Column(name = "per_apellido")
	private String per_apellido;
	
	@Column(name = "per_dni")
	private String per_dni;
	
	@Column(name = "per_cargo")
	private String per_cargo;
	
	@Column(name = "per_telefono")
	private String per_telefono;

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getPer_nombre() {
		return per_nombre;
	}

	public void setPer_nombre(String per_nombre) {
		this.per_nombre = per_nombre;
	}

	public String getPer_apellido() {
		return per_apellido;
	}

	public void setPer_apellido(String per_apellido) {
		this.per_apellido = per_apellido;
	}

	public String getPer_dni() {
		return per_dni;
	}

	public void setPer_dni(String per_dni) {
		this.per_dni = per_dni;
	}

	public String getPer_cargo() {
		return per_cargo;
	}

	public void setPer_cargo(String per_cargo) {
		this.per_cargo = per_cargo;
	}

	public String getPer_telefono() {
		return per_telefono;
	}

	public void setPer_telefono(String per_telefono) {
		this.per_telefono = per_telefono;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", per_nombre=" + per_nombre + ", per_apellido=" + per_apellido
				+ ", per_dni=" + per_dni + ", per_cargo=" + per_cargo + ", per_telefono=" + per_telefono + "]";
	}
	
	
	
}