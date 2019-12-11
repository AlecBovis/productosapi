package com.tecsup.productos.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "vehiculos")
public class Vehiculo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVehiculo")
	private Integer idVehiculo;
	
	@Column(name = "ve_placa")
	private String ve_placa;
	
	@ManyToOne
    @JoinColumn(name = "conductor_idPersonas")
    private Persona ve_conductor;
	
	@ManyToOne
    @JoinColumn(name = "ayudante_idPersonas")
    private Persona ve_ayudante;

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getVe_placa() {
		return ve_placa;
	}

	public Persona getVe_conductor() {
		return ve_conductor;
	}

	public void setVe_conductor(Persona ve_conductor) {
		this.ve_conductor = ve_conductor;
	}

	public Persona getVe_ayudante() {
		return ve_ayudante;
	}

	public void setVe_ayudante(Persona ve_ayudante) {
		this.ve_ayudante = ve_ayudante;
	}

	public void setVe_placa(String ve_placa) {
		this.ve_placa = ve_placa;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", ve_placa=" + ve_placa + ", ve_conductor=" + ve_conductor
				+ ", ve_ayudante=" + ve_ayudante + "]";
	}


	
	
}