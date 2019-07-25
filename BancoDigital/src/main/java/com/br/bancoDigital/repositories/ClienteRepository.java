package com.br.bancoDigital.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.bancoDigital.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
