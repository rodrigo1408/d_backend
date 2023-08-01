package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.business.ProdutoBusiness; 
import com.example.backend.entity.ProdutoEntity;


@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	ProdutoBusiness produtoBusiness;

	@GetMapping
	@RequestMapping(value = "/{id}") 
	public ResponseEntity<ProdutoEntity> buscarPeloId(@PathVariable Integer id) {

		//Se nao encontrar um produto com o ID passado como parametro, retorna um 404 NOT FOUND
		ProdutoEntity produtoEntity = produtoBusiness.buscarPeloId(id);

		return ResponseEntity.ok().body(produtoEntity);
	}

	@GetMapping
	@RequestMapping(value = "/listar")	
	public List<ProdutoEntity> get(){
		return produtoBusiness.listar();
	}

	@PostMapping
	@RequestMapping(value = "/adicionar")
	public ProdutoEntity post(ProdutoEntity produtoEntity) {
		return produtoBusiness.save(produtoEntity);
	}

	@PutMapping
	@RequestMapping(value = "/atualizar")
	public ProdutoEntity put(ProdutoEntity produtoEntity) {
		return produtoBusiness.atualizar(produtoEntity);
	}
	
	@DeleteMapping
	@RequestMapping(value = "/apagar/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Integer id) {
		produtoBusiness.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
