package com.cepedi.curso.resources;

import java.util.ArrayList;
import java.util.List;

import com.cepedi.curso.domain.Categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// adicionamos um ending point, famosa url
@RequestMapping(value = "/categorias")

public class CategoriaResource {

  @RequestMapping(method = RequestMethod.GET)
  public List<Categoria> listar() {

    Categoria cat = new Categoria(1, "Informática");
    Categoria cat1 = new Categoria(2, "Escritório");

    List<Categoria> lista = new ArrayList<>();
    lista.add(cat);
    lista.add(cat1);
    return lista;

  }

}