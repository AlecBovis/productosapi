package com.tecsup.productos.service.impl;

import org.springframework.stereotype.Service;

import com.tecsup.productos.entity.Cliente;
import com.tecsup.productos.repository.ClienteRepository;
import com.tecsup.productos.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "clienteService")
public class ClienteService implements IClienteService{

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return this.clienteRepository.findAll();
	}

	@Override
    @Transactional(readOnly = true)
    public Cliente findById(Integer id) {
        return this.clienteRepository.findById(id).orElse(null);
    }

	@Override
	@Transactional
	public void save(Cliente cliente) {
		this.clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}

}
