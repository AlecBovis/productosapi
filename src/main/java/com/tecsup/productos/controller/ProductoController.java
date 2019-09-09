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
import com.tecsup.productos.entity.Producto;
import com.tecsup.productos.service.IProductoService;

@CrossOrigin(origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE})
@RestController
@RequestMapping(value = {"/api"})
public class ProductoController {
	
	 @Autowired
	 @Qualifier(value = "productoService")
	 private IProductoService iProductoService;
	 
	 @GetMapping(value = {"/productos"})
	    List<Producto> showAll() {
	        return this.iProductoService.findAll();
	    }
	 
	 @GetMapping(value = {"/producto/{id}"})
	    Producto showIndividual(@PathVariable(value = "id") Integer id) {
	        return this.iProductoService.findById(id);
	    }
	 
	 @PostMapping(value = {"/producto"})
	 @ResponseStatus(HttpStatus.CREATED)
	   	Producto create(@RequestBody Producto oficio) {
	        this.iProductoService.save(oficio);
	        return oficio;
	    }
	 
	 @PutMapping(value = {"/producto/{id}"})
	 @ResponseStatus(HttpStatus.OK)
	    Producto update(@RequestBody Producto producto, @PathVariable(value = "id") Integer id) {
	        Producto currentProducto = this.iProductoService.findById(id);
	        currentProducto.setNombreProducto(producto.getNombreProducto());
	        currentProducto.setCategoriaProducto(producto.getCategoriaProducto());
	        currentProducto.setPrecioProducto(producto.getPrecioProducto());
	        currentProducto.setStockProducto(producto.getStockProducto());
	        this.iProductoService.save(currentProducto);
	        return currentProducto;
	    }
	 
	 @DeleteMapping(value = {"/producto/{id}"})
	    @ResponseStatus(HttpStatus.OK)
	    void delete(@PathVariable(value = "id") Integer id) {
	        Producto currentProducto = this.iProductoService.findById(id);
	        this.iProductoService.delete(currentProducto);
	    }

}
