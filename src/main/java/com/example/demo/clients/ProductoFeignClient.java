package com.example.demo.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.dto.Producto;

@FeignClient(name = "integracion-db", url = "http://localhost:8383/producto-db")
public interface ProductoFeignClient {
    
    @GetMapping(path = "/producto", produces = {"application/json"})
    public List<Producto> getAll();

    @PostMapping(path = "/producto", consumes = {"application/json"}, produces = {"application/json"})
    public Producto add(@RequestBody Producto producto);
}
