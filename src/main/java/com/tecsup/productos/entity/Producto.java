package com.tecsup.productos.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "productos")
public class Producto implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProducto")
	private Integer idProducto;
	
	@Column(name = "pro_name")
	private String nombreProducto;
	
	@Column(name = "pro_precio")
	private Double precioProducto;
	
	@Column(name = "pro_categoria")
	private String categoriaProducto;
	
	@Column(name = "pro_stock")
	private Integer stockProducto;

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}

	public Integer getStockProducto() {
		return stockProducto;
	}

	public void setStockProducto(Integer stockProducto) {
		this.stockProducto = stockProducto;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", categoriaProducto=" + categoriaProducto + ", stockProducto=" + stockProducto
				+ "]";
	}
	
}
