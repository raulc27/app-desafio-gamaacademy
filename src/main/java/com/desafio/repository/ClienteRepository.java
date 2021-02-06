package com.desafio.repository;

import java.util.HashMap;
import java.util.Map;

import com.desafio.model.Cliente;

public class ClienteRepository {

	private Map<String,Cliente> clienteRepository = new HashMap<String,Cliente>();
	public ClienteRepository() {
		clienteRepository.put("gso", new Cliente());
	}
	
	public Cliente buscar(String login) {
		return clienteRepository.get(login);
	}
	
}
