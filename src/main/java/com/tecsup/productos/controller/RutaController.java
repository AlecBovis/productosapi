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

import com.tecsup.productos.entity.Ruta;
import com.tecsup.productos.service.IRutaService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class RutaController {
	
	 @Autowired
	 @Qualifier(value = "rutaService")
	 private IRutaService iRutaService;
	 
	 @GetMapping(value = {"/rutas"})
	    List<Ruta> showAll() {
	        return this.iRutaService.findAll();
	    }
	 
	 @GetMapping(value = {"/ruta/{id}"})
	 Ruta showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iRutaService.findById(id);
	    }
	 
	 @PostMapping(value = {"/ruta"})
	 @ResponseStatus(HttpStatus.CREATED)
	 Ruta create(@RequestBody Ruta vehiculo) {
	        this.iRutaService.save(vehiculo);
	        return vehiculo;
	    }
	 
	 @PutMapping(value = {"/ruta/{id}"})
	 @ResponseStatus(HttpStatus.OK)
	 Ruta update(@RequestBody Ruta ruta, @PathVariable(value = "id") Integer id) {
		 Ruta currentRuta = this.iRutaService.findById(id);
		 currentRuta.setHr_peso(ruta.getHr_peso());
	        this.iRutaService.save(currentRuta);
	        return currentRuta;
	    }
	 
	 @DeleteMapping(value = {"/ruta/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
		 Ruta currentRuta = this.iRutaService.findById(id);
	        this.iRutaService.delete(currentRuta);
	    }

}