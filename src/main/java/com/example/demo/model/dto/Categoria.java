package com.example.demo.model.dto;

import java.util.List;

public class Categoria {

    private int    idCategoria;
    private String nombre;
    private List<Producto> productosByIdCategoria;

    public Categoria() {
    }

    public int getIdCategoriapro() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getInstrumentosByIdCategoria() {
        return productosByIdCategoria;
    }

    public void setInstrumentosByIdCategoria(List<Producto> productosByIdCategoria) {
        this.productosByIdCategoria = productosByIdCategoria;
    }
}
