package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	 public ProdutoEntity get(@PathVariable(value = "id") Integer id) {
		 return produtoBusiness.findById(id);
	 }
	 
	 @GetMapping
	 @RequestMapping(value = "/listar")
	 public List<ProdutoEntity> get(){
		 return produtoBusiness.findAll();
	 }
	 
	 @PostMapping
	 @RequestMapping(value = "/adicionar")
	 public ProdutoEntity post(ProdutoEntity produtoEntity) {
		 return produtoBusiness.save(produtoEntity);
	 }

}
