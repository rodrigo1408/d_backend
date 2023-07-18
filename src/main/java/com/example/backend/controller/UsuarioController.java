package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.business.UsuarioBusiness;
import com.example.backend.entity.UsuarioEntity;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioBusiness usuarioBusiness;
	
	@GetMapping
	@RequestMapping(value = "/{id}")
	public UsuarioEntity get(@PathVariable(value = "id") Integer id) {
		return usuarioBusiness.findById(id);
	}
	
	@GetMapping
	@RequestMapping(value = "/listar")
	public List<UsuarioEntity> get(){
		return usuarioBusiness.findAll();
	}
	
	@PostMapping
	@RequestMapping(value = "/adicionar")
	public UsuarioEntity post(UsuarioEntity usuarioEntity){
		return usuarioBusiness.save(usuarioEntity);
	}
}
