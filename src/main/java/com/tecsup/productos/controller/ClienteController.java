package com.tecsup.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tecsup.productos.entity.Cliente;
import com.tecsup.productos.service.IClienteService;


@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class ClienteController {
	
	 @Autowired
	 @Qualifier(value = "clienteService")
	 private IClienteService iClienteService;
	 
	 @GetMapping(value = {"/clientes"})
	    List<Cliente> showAll() {
	        return this.iClienteService.findAll();
	    }
	 
	 @GetMapping(value = {"/cliente/{id}"})
	    Cliente showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iClienteService.findById(id);
	    }
	 
	 @PostMapping(value = {"/cliente"})
	 @ResponseStatus(HttpStatus.CREATED)
	 Cliente create(@RequestBody Cliente cliente ) {
	        this.iClienteService.save(cliente);
	        return cliente;
	    }
	 
	 @PutMapping(value = {"/cliente/{id}"})
	 @ResponseStatus(HttpStatus.OK)
	 Cliente update(@RequestBody Cliente cliente, @PathVariable(value = "id") Integer id) {
		 Cliente currentCliente = this.iClienteService.findById(id);
		 currentCliente.setCli_descripcion(cliente.getCli_descripcion());
	        this.iClienteService.save(currentCliente);
	        return currentCliente;
	    }
	 
	 @DeleteMapping(value = {"/cliente/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
		 Cliente currentCliente = this.iClienteService.findById(id);
	        this.iClienteService.delete(currentCliente);
	    }

}