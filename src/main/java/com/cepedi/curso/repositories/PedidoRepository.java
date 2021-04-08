package com.cepedi.curso.repositories;

import com.cepedi.curso.domain.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dizemos que Integer é p tipo do identificador - ID, Pedido o tipo de dado armazenado
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
