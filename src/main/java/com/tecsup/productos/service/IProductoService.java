package com.tecsup.productos.service;


import com.tecsup.productos.entity.Producto;
import java.util.List;

public interface IProductoService {
	
	List<Producto> findAll();

    Producto findById(Integer id);

    void save(Producto producto);

    void delete(Producto producto);

}
