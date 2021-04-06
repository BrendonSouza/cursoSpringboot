package com.cepedi.curso.repositories;

import com.cepedi.curso.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//dizemos que Integer é p tipo do identificador - ID, Categoria o tipo de dado armazenado
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
