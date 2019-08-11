package com.tropicalizacion.tropicalizacionbackend.servicios;

import com.tropicalizacion.tropicalizacionbackend.entidades.bd.CategoriaEntidad;
import com.tropicalizacion.tropicalizacionbackend.repositorios.CategoriasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServicioImpl implements CategoriaServicio {

    private CategoriasRepositorio categoriasRepositorio;

    @Autowired
    public CategoriaServicioImpl(CategoriasRepositorio categoriasRepositorio){
        this.categoriasRepositorio = categoriasRepositorio;
    }

    public void agregarCategoria(CategoriaEntidad categoriaEntidad){
        categoriasRepositorio.save(categoriaEntidad);
    }

    public void borrarCategoria(CategoriaEntidad categoriaEntidad){

    }

    public void modificarCategoria(CategoriaEntidad categoriaEntidad){

    }

    public ArrayList<String> getCategoriasNombre(){
        List<CategoriaEntidad> categorias =  categoriasRepositorio.findAll();
        ArrayList<String> categoriasNombre = new ArrayList<>();
        categorias.forEach(categoria -> categoriasNombre.add(categoria.getNombre()));
        return categoriasNombre;
    }
}
