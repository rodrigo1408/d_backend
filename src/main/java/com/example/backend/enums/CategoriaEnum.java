package com.example.backend.enums;

public enum CategoriaEnum {

	
	MASSAS("Massas"), HAMBURGUERES("Hamburgueres"), BEBIDAS("Bebidas");
	
	private String descricao;
	
	private CategoriaEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
