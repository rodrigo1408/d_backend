package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.business.ClienteBusiness;
import com.example.backend.entity.ClienteEntity;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {
	
	@Autowired
	ClienteBusiness clienteBusiness;
	
	@GetMapping
	@RequestMapping(value = "/{id}")
	public ClienteEntity get(@PathVariable(value = "id") Integer id) {
		return clienteBusiness.findById(id);
	}
	
	@GetMapping
	@RequestMapping(value = "/listar")
	public List<ClienteEntity> get(){
		return clienteBusiness.findAll();
	}
	
	@PostMapping
	@RequestMapping(value = "/adicionar")
	public ClienteEntity post(ClienteEntity usuarioEntity){
		return clienteBusiness.save(usuarioEntity);
	}
}
