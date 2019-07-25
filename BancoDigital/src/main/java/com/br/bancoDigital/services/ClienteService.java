package com.br.bancoDigital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bancoDigital.models.Cliente;
import com.br.bancoDigital.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public Iterable<Cliente> exibirMeusClientes(){
		return clienteRepository.findAll();
	}
}
