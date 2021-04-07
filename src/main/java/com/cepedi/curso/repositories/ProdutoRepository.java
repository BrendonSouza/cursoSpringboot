package com.cepedi.curso.repositories;

import com.cepedi.curso.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dizemos que Integer é p tipo do identificador - ID, Produto o tipo de dado armazenado
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
