package com.cepedi.curso.services;

import java.util.Optional;

import com.cepedi.curso.domain.Categoria;
import com.cepedi.curso.repositories.CategoriaRepository;
import com.cepedi.curso.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

  @Autowired
  private CategoriaRepository repo;

  public Categoria find(Integer id) {
    Optional<Categoria> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado cara! Id: " + id + ", Tipo: " + Categoria.class.getName()));
  }
}
