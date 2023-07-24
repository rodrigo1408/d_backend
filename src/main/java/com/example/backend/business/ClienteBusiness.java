package com.example.backend.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.ClienteEntity;
import com.example.backend.repository.ClienteRepository;


@Service
public class ClienteBusiness {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public ClienteEntity findById(Integer id) {
		return clienteRepository.findById(id).get();
	}

	public List<ClienteEntity> findAll() { 
	 return clienteRepository.findAll();
	}

	public ClienteEntity save(ClienteEntity usuarioEntity){
		return clienteRepository.save(usuarioEntity);
	}
}
