package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.clients.ProductoFeignClient;
import com.example.demo.model.dto.Producto;

/*Get: para solicitar información de un recurso.
Post: para enviar información a fin de crear o de actualizar un recurso.
Put: para enviar información a fin de modificar un recurso.
Patch: actualiza una parte del recurso.
Delete: elimina un recurso específico. */

/* @Service funciona de forma parecida a la anotación @Controller, 
ya que permite que Spring reconozca a capa como servicio 
al escanear los componentes de la aplicación.*/



@Service
public class ProductoService {

    @Autowired
    ProductoFeignClient productoFeignClient;

    public List<Producto> getAll(){
        return productoFeignClient.getAll();
       }
    
    public Producto add(Producto producto){
        return productoFeignClient.add(producto);  
        }
}    
