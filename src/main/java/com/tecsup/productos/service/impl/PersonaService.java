package com.tecsup.productos.service.impl;

import org.springframework.stereotype.Service;

import com.tecsup.productos.entity.Persona;
import com.tecsup.productos.repository.PersonaRepository;
import com.tecsup.productos.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "personaService")
public class PersonaService implements IPersonaService{

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		return this.personaRepository.findAll();
	}

	@Override
    @Transactional(readOnly = true)
    public Persona findById(Integer id) {
        return this.personaRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public void save(Persona persona) {
		this.personaRepository.save(persona);
	}

	@Override
	@Transactional
	public void delete(Persona persona) {
		this.personaRepository.delete(persona);
	}

}
