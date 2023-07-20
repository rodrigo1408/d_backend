package com.example.backend.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.ProdutoEntity;
import com.example.backend.repository.ProdutoRepository;

@Service
public class ProdutoBusiness {

	@Autowired
	ProdutoRepository produtoRepository;

	public ProdutoEntity findById(Integer id) {
		return produtoRepository.findById(id).get();
	}
	
	public List<ProdutoEntity> findAll() {
		return produtoRepository.findAll();
	}
	
	public ProdutoEntity save(ProdutoEntity produtoEntity) {
		return produtoRepository.save(produtoEntity);
	}
	
}
