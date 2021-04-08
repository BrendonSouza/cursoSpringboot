package com.cepedi.curso.repositories;

import com.cepedi.curso.domain.Pagamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dizemos que Integer é p tipo do identificador - ID, Pagamento o tipo de dado armazenado
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
