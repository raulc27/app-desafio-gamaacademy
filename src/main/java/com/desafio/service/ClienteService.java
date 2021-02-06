package com.desafio.service;
import com.desafio.model.Cliente;

public class ClienteService {
public Cliente criarCliente(String login) {
	if(login==null)
		throw new NullPointerException("O campo login é obrigatório");
	if(login.length()>20)
		throw new IllegalArgumentException("O campo permite até 20 caracteres");
	
	Cliente user = new Cliente();
	user.setLogin(login);
	return user;
}
}
