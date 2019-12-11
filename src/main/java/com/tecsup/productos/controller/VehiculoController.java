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
import com.tecsup.productos.entity.Vehiculo;
import com.tecsup.productos.service.IVehiculoService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class VehiculoController {
	
	 @Autowired
	 @Qualifier(value = "vehiculoService")
	 private IVehiculoService iVehiculoService;
	 
	 @GetMapping(value = {"/vehiculos"})
	    List<Vehiculo> showAll() {
	        return this.iVehiculoService.findAll();
	    }
	 
	 @GetMapping(value = {"/vehiculo/{id}"})
	 Vehiculo showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iVehiculoService.findById(id);
	    }
	 
	 @PostMapping(value = {"/vehiculo"})
	 @ResponseStatus(HttpStatus.CREATED)
	 Vehiculo create(@RequestBody Vehiculo vehiculo) {
	        this.iVehiculoService.save(vehiculo);
	        return vehiculo;
	    }
	 
	 @PutMapping(value = {"/vehiculo/{id}"})
	 @ResponseStatus(HttpStatus.OK)
	 Vehiculo update(@RequestBody Vehiculo vehiculo, @PathVariable(value = "id") Integer id) {
		 Vehiculo currentVehiculo = this.iVehiculoService.findById(id);
		 currentVehiculo.setVe_placa(vehiculo.getVe_placa());
	        this.iVehiculoService.save(currentVehiculo);
	        return currentVehiculo;
	    }
	 
	 @DeleteMapping(value = {"/vehiculo/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
		 Vehiculo currentVehiculo = this.iVehiculoService.findById(id);
	        this.iVehiculoService.delete(currentVehiculo);
	    }

}