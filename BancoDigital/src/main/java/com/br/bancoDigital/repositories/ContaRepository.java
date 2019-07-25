package com.br.bancoDigital.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.bancoDigital.models.Conta;

@Repository
public interface ContaRepository extends CrudRepository<Conta, Integer>{

}
