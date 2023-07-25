package com.example.backend.enums;

public enum StatusEnum {


	ABERTO("Aberto"), PROGESSO("Progesso"), ENTREGA("Entrega");
	
	private String descricao;
	
	private StatusEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
