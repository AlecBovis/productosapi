package com.tecsup.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tecsup.productos.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
