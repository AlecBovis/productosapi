package com.tecsup.productos.service.impl;

import org.springframework.stereotype.Service;

import com.tecsup.productos.entity.Vehiculo;
import com.tecsup.productos.repository.VehiculoRepository;
import com.tecsup.productos.service.IVehiculoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "vehiculoService")
public class VehiculoService implements IVehiculoService {
	
	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Vehiculo> findAll() {
		return this.vehiculoRepository.findAll();
	}

	@Override
    @Transactional(readOnly = true)
    public Vehiculo findById(Integer id) {
        return this.vehiculoRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public void save(Vehiculo vehiculo) {
		this.vehiculoRepository.save(vehiculo);
	}

	@Override
	@Transactional
	public void delete(Vehiculo vehiculo) {
		this.vehiculoRepository.delete(vehiculo);
	}

}
