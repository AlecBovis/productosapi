package com.tecsup.productos.service.impl;

import org.springframework.stereotype.Service;

import com.tecsup.productos.entity.Ruta;
import com.tecsup.productos.repository.RutaRepository;
import com.tecsup.productos.service.IRutaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "rutaService")
public class RutaService implements IRutaService {
	
	@Autowired
	private RutaRepository rutaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Ruta> findAll() {
		return this.rutaRepository.findAll();
	}

	@Override
    @Transactional(readOnly = true)
    public Ruta findById(Integer id) {
        return this.rutaRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public void save(Ruta ruta) {
		this.rutaRepository.save(ruta);
	}

	@Override
	@Transactional
	public void delete(Ruta ruta) {
		this.rutaRepository.delete(ruta);
	}

}