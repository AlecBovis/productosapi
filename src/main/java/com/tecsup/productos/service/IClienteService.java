package com.tecsup.productos.service;

import com.tecsup.productos.entity.Cliente;
import java.util.List;

public interface IClienteService {

	List<Cliente> findAll();

	Cliente findById(Integer id);

    void save(Cliente cliente);

    void delete(Cliente cliente);

}
