package com.tecsup.productos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "hojaderutas")
public class Ruta implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHojadeRutas")
	private Integer idHojadeRutas;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "hr_fecha")
    private Date hr_fecha;
	
	@Column(name = "hr_tipo")
	private String hr_tipo;
	
	@Column(name = "hr_numpedido")
	private Integer hr_numpedido;
	
	@Column(name = "hr_numguia")
	private String hr_numguia;
	
	@Column(name = "hr_bultos")
	private Integer hr_bultos;
	
	@Column(name = "hr_peso")
	private Double hr_peso;
	
	@Column(name = "hr_secuencia")
	private Integer hr_secuencia;
	
	@ManyToOne
    @JoinColumn(name = "producto_idProducto")
    private Producto producto_idProducto;
	
	@ManyToOne
    @JoinColumn(name = "cliente_idCliente")
    private Cliente cliente_idCliente;
	
	@ManyToOne
    @JoinColumn(name = "vehiculo_idVehiculo")
    private Vehiculo vehiculo_idVehiculo;

	public Integer getIdHojadeRutas() {
		return idHojadeRutas;
	}

	public void setIdHojadeRutas(Integer idHojadeRutas) {
		this.idHojadeRutas = idHojadeRutas;
	}

	public Date getHr_fecha() {
		return hr_fecha;
	}

	public void setHr_fecha(Date hr_fecha) {
		this.hr_fecha = hr_fecha;
	}

	public String getHr_tipo() {
		return hr_tipo;
	}

	public void setHr_tipo(String hr_tipo) {
		this.hr_tipo = hr_tipo;
	}

	public Integer getHr_numpedido() {
		return hr_numpedido;
	}

	public void setHr_numpedido(Integer hr_numpedido) {
		this.hr_numpedido = hr_numpedido;
	}

	public String getHr_numguia() {
		return hr_numguia;
	}

	public void setHr_numguia(String hr_numguia) {
		this.hr_numguia = hr_numguia;
	}

	public Integer getHr_bultos() {
		return hr_bultos;
	}

	public void setHr_bultos(Integer hr_bultos) {
		this.hr_bultos = hr_bultos;
	}

	public Double getHr_peso() {
		return hr_peso;
	}

	public void setHr_peso(Double hr_peso) {
		this.hr_peso = hr_peso;
	}

	public Integer getHr_secuencia() {
		return hr_secuencia;
	}

	public void setHr_secuencia(Integer hr_secuencia) {
		this.hr_secuencia = hr_secuencia;
	}

	public Producto getProducto_idProducto() {
		return producto_idProducto;
	}

	public void setProducto_idProducto(Producto producto_idProducto) {
		this.producto_idProducto = producto_idProducto;
	}

	public Cliente getCliente_idCliente() {
		return cliente_idCliente;
	}

	public void setCliente_idCliente(Cliente cliente_idCliente) {
		this.cliente_idCliente = cliente_idCliente;
	}

	public Vehiculo getVehiculo_idVehiculo() {
		return vehiculo_idVehiculo;
	}

	public void setVehiculo_idVehiculo(Vehiculo vehiculo_idVehiculo) {
		this.vehiculo_idVehiculo = vehiculo_idVehiculo;
	}

	@Override
	public String toString() {
		return "Ruta [idHojadeRutas=" + idHojadeRutas + ", hr_fecha=" + hr_fecha + ", hr_tipo=" + hr_tipo
				+ ", hr_numpedido=" + hr_numpedido + ", hr_numguia=" + hr_numguia + ", hr_bultos=" + hr_bultos
				+ ", hr_peso=" + hr_peso + ", hr_secuencia=" + hr_secuencia + ", producto_idProducto="
				+ producto_idProducto + ", cliente_idCliente=" + cliente_idCliente + ", vehiculo_idVehiculo="
				+ vehiculo_idVehiculo + "]";
	}

	
	
	
}