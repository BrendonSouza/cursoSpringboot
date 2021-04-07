package com.cepedi.curso.repositories;

import org.springframework.stereotype.Repository;

import com.cepedi.curso.domain.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
