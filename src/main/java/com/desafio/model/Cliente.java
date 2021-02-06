package com.desafio.model;

public class Cliente {
	

	private String nome;
	private String login;
	private String cpf;
	private String senha;

	
	public Cliente() {
		
	}
	
	public Cliente(int id, String login, String nome, String cpf, String senha) {
		super();
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getLogin() {
		return login;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public String getCPF() {
		return cpf;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	
	
	
}
