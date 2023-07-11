package com.example.demo.controller;


import com.example.demo.model.dto.Producto;

/*Paquete controller para todos los endpoints que tenga nuestra aplicación.
Paquete service para agregar alli las clases que respondan a la funcionalidad y lógica.
Paquete model para las representaciones de nuestro modelo de datos (entidades).
Paquete repository para las clases que establecen la comunicación con la base de datos.*/

/*métodos de un mapeo podemos usar:

Get: para solicitar información de un recurso.
Post: para enviar información a fin de crear o de actualizar un recurso.
Put: para enviar información a fin de modificar un recurso.
Patch: actualiza una parte del recurso.
Delete: elimina un recurso específico. */
/*Post y Put radica en que Post lo usamos para añadir un recurso y Put lo utilizamos para modificar un recurso en particular.
 Patch también lo utilizamos para actualizar un recurso pero solo una parcialidad del mismo.*/

/*@Controller: Con esta anotación Spring podrá detectar la clase SampleController cuando realice el escaneo de componentes.
@Autowired: A través de esta anotación Spring será capaz de llevar a cabo la inyección de dependencias sobre el atributo marcado. En este caso, estamos inyectando la capa de servicio, y por eso no tenemos que instanciarla.
@RequestMapping: Con esta anotación especificamos la ruta desde la que escuchará el servicio, 
y qué método le corresponde.
@ResponseBody: Con ella definimos lo que será el cuerpo de la respuesta del servicio.
@PathVariable: Sirve para indicar con qué variable de la url se relaciona el parámetro sobre el que se esté usando la anotación.
Podemos también utilizar la etiqueta @RestController en lugar de @Controller, que sustituye al uso de @Controller + @ResponseBody
*/

import com.example.demo.services.ProductoService;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    
    @Autowired
    ProductoService productoService;

    @GetMapping(path = "/producto", produces = {"application/json"})
    public List<Producto> getAll(){
            return productoService.getAll();
        }
    @PostMapping(path = "/producto", consumes = {"application/json"}, produces = {"application/json"})
    public Producto add(@RequestBody Producto producto){
        return productoService.add(producto);
    }          

}
