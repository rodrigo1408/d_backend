package com.example.backend.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.EnderecoEntity;
import com.example.backend.repository.EnderecoRepository;

@Service
public class EnderecoBusiness {

	@Autowired
	EnderecoRepository enderecoRepository;
	
	public EnderecoEntity findById(Integer id) {
		return enderecoRepository.findById(id).get();
	}
	
	public List<EnderecoEntity> findAll(){
		return enderecoRepository.findAll();
	}
	
	public EnderecoEntity save(EnderecoEntity enderecoEntity) {
		return enderecoRepository.save(enderecoEntity);
	}
}
