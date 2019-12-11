package com.tecsup.productos.service;


import com.tecsup.productos.entity.Vehiculo;
import java.util.List;

public interface IVehiculoService {
	
	List<Vehiculo> findAll();

	Vehiculo findById(Integer id);

    void save(Vehiculo vehiculo);

    void delete(Vehiculo vehiculo);

}
