package com.tecsup.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsup.productos.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
