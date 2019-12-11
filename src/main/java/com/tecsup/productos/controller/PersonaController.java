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

import com.tecsup.productos.entity.Persona;
import com.tecsup.productos.service.IPersonaService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class PersonaController {
	
	 @Autowired
	 @Qualifier(value = "personaService")
	 private IPersonaService iPersonaService;
	 
	 @GetMapping(value = {"/personas"})
	    List<Persona> showAll() {
	        return this.iPersonaService.findAll();
	    }
	 
	 @GetMapping(value = {"/persona/{id}"})
	 Persona showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iPersonaService.findById(id);
	    }
	 
	 @PostMapping(value = {"/persona"})
	 @ResponseStatus(HttpStatus.CREATED)
	 Persona create(@RequestBody Persona persona) {
	        this.iPersonaService.save(persona);
	        return persona;
	    }
	 
	 @PutMapping(value = {"/persona/{id}"})
	 @ResponseStatus(HttpStatus.OK)
	 Persona update(@RequestBody Persona persona, @PathVariable(value = "id") Integer id) {
		 Persona currentPersona = this.iPersonaService.findById(id);
		 currentPersona.setPer_nombre(persona.getPer_nombre());
	        this.iPersonaService.save(currentPersona);
	        return currentPersona;
	    }
	 
	 @DeleteMapping(value = {"/persona/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
		 Persona currentPersona = this.iPersonaService.findById(id);
	        this.iPersonaService.delete(currentPersona);
	    }

}