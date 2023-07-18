package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.business.EnderecoBusiness;
import com.example.backend.entity.EnderecoEntity;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

	@Autowired
	EnderecoBusiness enderecoBusiness;
	
	@GetMapping
	@RequestMapping(value = "/{id}")
	public EnderecoEntity get(@PathVariable(value = "id") Integer id) {
		return enderecoBusiness.findById(id);
	}
	
	@GetMapping
	@RequestMapping(value = "/listar")
	public List<EnderecoEntity> get(){
		return enderecoBusiness.findAll();
	}
	
	@PostMapping
	@RequestMapping(value = "/adicionar")
	public EnderecoEntity post(EnderecoEntity enderecoEntity) {
		return enderecoBusiness.save(enderecoEntity);
	}
}
