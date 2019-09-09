package com.tecsup.productos.service.impl;

import org.springframework.stereotype.Service;

import com.tecsup.productos.entity.Producto;
import com.tecsup.productos.repository.ProductoRepository;
import com.tecsup.productos.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "productoService")
public class ProductoService implements IProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return this.productoRepository.findAll();
	}

	@Override
    @Transactional(readOnly = true)
    public Producto findById(Integer id) {
        return this.productoRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public void save(Producto producto) {
		this.productoRepository.save(producto);
	}

	@Override
	@Transactional
	public void delete(Producto producto) {
		this.productoRepository.delete(producto);
	}

}
