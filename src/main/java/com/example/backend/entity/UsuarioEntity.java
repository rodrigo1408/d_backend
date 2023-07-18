package com.example.backend.entity;

 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "USUARIO")
public class UsuarioEntity {
	
	@Id 
	@GeneratedValue
	@Column(name = "ID")
	Integer id;
	
	@Column(name = "NOME")
	String nome;
	
	@Column(name = "CPF")
	String cpf;
	
	@Column(name = "SENHA")
	String senha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENDERECO_ID")
	EnderecoEntity endereco;

	public UsuarioEntity() {
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}
	
	
}
