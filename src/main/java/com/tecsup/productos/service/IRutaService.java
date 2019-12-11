package com.tecsup.productos.service;


import com.tecsup.productos.entity.Ruta;
import java.util.List;

public interface IRutaService {
	
	List<Ruta> findAll();

	Ruta findById(Integer id);

    void save(Ruta ruta);

    void delete(Ruta ruta);

}

