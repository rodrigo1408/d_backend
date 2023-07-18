package com.example.backend.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.UsuarioEntity;
import com.example.backend.repository.UsuarioRepository;


@Service
public class UsuarioBusiness {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioEntity findById(Integer id) {
		return usuarioRepository.findById(id).get();
	}

	public List<UsuarioEntity> findAll() { 
	 return usuarioRepository.findAll();
	}

	public UsuarioEntity save(UsuarioEntity usuarioEntity){
		return usuarioRepository.save(usuarioEntity);
	}
}
