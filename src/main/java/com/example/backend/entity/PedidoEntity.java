package com.example.backend.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name = "PEDIDO")
public class PedidoEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	Integer id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE_ID")
	ClienteEntity clienteEntity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUTO_ID")
	ProdutoEntity produtoEntity;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ENDERECO_ID")
	EnderecoEntity enderecoEntity;
	
	@Column(name = "ENTREGA")
	Boolean entrega;
	
	@Column(name = "DESCONTO")
	Double desconto;
	
	@Column(name = "TAXA_ENTREGA")
	Double taxaEntrega;
	
	@Column(name = "VALOR")
	Double valor;
	
	@Column(name = "DATA")
	Date data;

	@Column(name = "QUANTIDADE")
	Long quantidade;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATUS_ID")
	StatusEntity statusEntity;

	
	public PedidoEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ClienteEntity getClienteEntity() {
		return clienteEntity;
	}

	public void setClienteEntity(ClienteEntity clienteEntity) {
		this.clienteEntity = clienteEntity;
	}

	public ProdutoEntity getProdutoEntity() {
		return produtoEntity;
	}

	public void setProdutoEntity(ProdutoEntity produtoEntity) {
		this.produtoEntity = produtoEntity;
	}

	public EnderecoEntity getEnderecoEntity() {
		return enderecoEntity;
	}

	public void setEnderecoEntity(EnderecoEntity enderecoEntity) {
		this.enderecoEntity = enderecoEntity;
	}

	public Boolean getEntrega() {
		return entrega;
	}

	public void setEntrega(Boolean entrega) {
		this.entrega = entrega;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTaxaEntrega() {
		return taxaEntrega;
	}

	public void setTaxaEntrega(Double taxaEntrega) {
		this.taxaEntrega = taxaEntrega;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public StatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(StatusEntity statusEntity) {
		this.statusEntity = statusEntity;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "PedidoEntity [id=" + id + ", clienteEntity=" + clienteEntity + ", produtoEntity=" + produtoEntity
				+ ", enderecoEntity=" + enderecoEntity + ", entrega=" + entrega + ", desconto=" + desconto
				+ ", taxaEntrega=" + taxaEntrega + ", valor=" + valor + ", data=" + data + ", quantidade=" + quantidade
				+ ", statusEntity=" + statusEntity + "]";
	}	
}
