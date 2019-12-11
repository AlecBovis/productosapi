package com.tecsup.productos.service;

import com.tecsup.productos.entity.Persona;
import java.util.List;

public interface IPersonaService {

	List<Persona> findAll();

	Persona findById(Integer id);

    void save(Persona persona);

    void delete(Persona persona);

}
