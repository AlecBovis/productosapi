package com.tecsup.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsup.productos.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
