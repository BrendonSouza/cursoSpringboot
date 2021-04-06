package com.cepedi.curso.resources;

import com.cepedi.curso.domain.Categoria;
import com.cepedi.curso.services.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// adicionamos um ending point, famosa url
@RequestMapping(value = "/categorias")

public class CategoriaResource {
  @Autowired
  private CategoriaService service;

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  // PathVariable serve para passar o que vier na url pra dentro do obj
  public ResponseEntity<?> listar(@PathVariable Integer id) {

    Categoria obj = service.buscar(id);

    return ResponseEntity.ok().body(obj);

  }

}