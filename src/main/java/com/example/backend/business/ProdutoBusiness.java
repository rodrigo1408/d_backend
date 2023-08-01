package com.example.backend.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.backend.entity.ProdutoEntity;
import com.example.backend.exception.RecursoNaoEncontradoException;
import com.example.backend.repository.ProdutoRepository;

@Service
public class ProdutoBusiness {

	@Autowired
	ProdutoRepository produtoRepository;
	
	
	public ProdutoEntity buscarPeloId(Integer id) {
		
		ProdutoEntity produtoEntity = produtoRepository.findById(id).get();
		
		if(produtoEntity.getId() == null) { 
			/* neste caso ira lancar uma RecursoNaoEncontradoException, que ira chamar o ExceptionHandler 
			 * correspondente da classe RecursosExceptionHandler do pacote handler, quer ira 
			 *retornar um 404 para o cliente com detalhes da possivel causa do erro */
			throw new RecursoNaoEncontradoException("Nenhum produto foi encontrado");
		}

		return produtoRepository.findById(id).get();
	}


	/*
	 * public ProdutoEntity buscarPeloId(Integer id) {
	 * 
	 * ProdutoEntity produtoEntity = produtoRepository.findOne(id);
	 * 
	 * if(produtoEntity == null) { neste caso ira lancar uma
	 * RecursoNaoEncontradoException, que ira chamar o ExceptionHandler
	 * correspondente da classe RecursosExceptionHandler do pacote handler, quer ira
	 * retornar um 404 para o cliente com detalhes da possivel causa do erro throw
	 * new RecursoNaoEncontradoException("Nenhum produto foi encontrado"); }
	 * 
	 * return produtoEntity; }
	 */

	/**
	 * Metodo para verificar a existencia de um vinho. Chama o metodo buscarPeloId
	 * que se nao encontrar o produto lanca uma excecao que lanca um NOT FOUND
	 * 
	 * @param produto
	 */
	public void verificarExistencia(ProdutoEntity produtoEntity) {
		buscarPeloId(produtoEntity.getId());
	}

	public List<ProdutoEntity> listar() {
		return produtoRepository.findAll();
	}

	public ProdutoEntity save(ProdutoEntity produtoEntity) {
		return produtoRepository.save(produtoEntity);
	}

	public ProdutoEntity atualizar(ProdutoEntity produtoEntity) {

		/*
		 * vericando se o vinho realmente existe, poderia ter chamado o metodo
		 * buscarPeloId direto, mas criei o metodo verificar existencia para ajudar na
		 * legibilidade do codigo
		 */
		verificarExistencia(produtoEntity);
		return produtoRepository.save(produtoEntity);
	}

	public void deletar(Integer id) {
		try {
			produtoRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new RecursoNaoEncontradoException("O produto não foi encontrado");
		} 
	}  

}
