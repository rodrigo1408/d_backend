package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.business.PedidoBusiness;
import com.example.backend.entity.PedidoEntity;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
	
	@Autowired
	PedidoBusiness pedidoBusiness;
	
	@GetMapping(value = "/{id}")
	public PedidoEntity get(@PathVariable(value = "id") Integer id) {
		return pedidoBusiness.findById(id);
	}
	
	@GetMapping(value = "/listar")
	public List<PedidoEntity> get() {
		return pedidoBusiness.findAll();
	}
	
	@PostMapping(value = "/adicionar")
	public PedidoEntity post(PedidoEntity pedidoEntity) {
		/* Calculo do desconto encima do valor bruto */
		Double desconto = pedidoEntity.getValor() * (pedidoEntity.getDesconto() / 100);
		
		Double valorFinal = pedidoEntity.getValor();
		
		//colocar somente duas casas decimal nesse metodo
		pedidoEntity.setValor(desconto - valorFinal);
		
		return pedidoBusiness.save(pedidoEntity);
	}
}
