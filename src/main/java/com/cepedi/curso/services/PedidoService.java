package com.cepedi.curso.services;

import java.util.Optional;

import com.cepedi.curso.domain.Pedido;
import com.cepedi.curso.repositories.PedidoRepository;
import com.cepedi.curso.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

  @Autowired
  private PedidoRepository repo;

  public Pedido find(Integer id) {
    Optional<Pedido> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Pedido não encontrado cara! Id: " + id + ", Tipo: " + Pedido.class.getName()));

  }

}
