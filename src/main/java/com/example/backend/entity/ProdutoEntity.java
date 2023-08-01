package com.example.backend.entity;

import java.io.Serializable;

import com.example.backend.enums.CategoriaEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id; 

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity(name = "PRODUTO")
public class ProdutoEntity implements Serializable{
 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "PRECO")
	private Double preco;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "CATEGORIA")
	private CategoriaEnum categoriaEnum;
	
	public ProdutoEntity() {
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
 

	public CategoriaEnum getCategoriaEnum() {
		return categoriaEnum;
	}

	public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
		this.categoriaEnum = categoriaEnum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoEntity other = (ProdutoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}  
}
