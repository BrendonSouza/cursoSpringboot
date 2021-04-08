package com.cepedi.curso.repositories;

import com.cepedi.curso.domain.ItemPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dizemos que Integer é p tipo do identificador - ID, ItemPedido o tipo de dado armazenado
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
