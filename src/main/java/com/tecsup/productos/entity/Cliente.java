package com.tecsup.productos.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCliente")
	private Integer idCliente;
	
	@Column(name = "cli_descripcion")
	private String cli_descripcion;
	
	@Column(name = "cli_direccion")
	private String cli_direccion;
	
	@Column(name = "cli_correo")
	private String cli_correo;
	
	@Column(name = "cli_telefono")
	private String cli_telefono;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCli_descripcion() {
		return cli_descripcion;
	}

	public void setCli_descripcion(String cli_descripcion) {
		this.cli_descripcion = cli_descripcion;
	}

	public String getCli_direccion() {
		return cli_direccion;
	}

	public void setCli_direccion(String cli_direccion) {
		this.cli_direccion = cli_direccion;
	}

	public String getCli_correo() {
		return cli_correo;
	}

	public void setCli_correo(String cli_correo) {
		this.cli_correo = cli_correo;
	}

	public String getCli_telefono() {
		return cli_telefono;
	}

	public void setCli_telefono(String cli_telefono) {
		this.cli_telefono = cli_telefono;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cli_descripcion=" + cli_descripcion + ", cli_direccion="
				+ cli_direccion + ", cli_correo=" + cli_correo + ", cli_telefono=" + cli_telefono + "]";
	}
	
}