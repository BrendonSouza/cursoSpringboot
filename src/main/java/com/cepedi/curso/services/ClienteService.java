package com.cepedi.curso.services;

import java.util.Optional;

import com.cepedi.curso.domain.Cliente;
import com.cepedi.curso.repositories.ClienteRepository;
import com.cepedi.curso.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository repo;

  public Cliente find(Integer id) {
    Optional<Cliente> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException(
        "cliente não encontrado cara! Id: " + id + ", Tipo: " + Cliente.class.getName()));

  }

}
