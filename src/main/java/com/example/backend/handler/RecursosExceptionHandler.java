package com.example.backend.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.backend.entity.DetalhesErroEntity;
import com.example.backend.exception.RecursoNaoEncontradoException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class RecursosExceptionHandler {

	
		//este metodo sera chamado sempre que uma RecursoNaoEncontradoException for lancada
		@ExceptionHandler(RecursoNaoEncontradoException.class)
		public ResponseEntity<DetalhesErroEntity> handlerRecursoNaoEncontrado(RecursoNaoEncontradoException e, HttpServletRequest request){
			
			DetalhesErroEntity erro = new DetalhesErroEntity();
			erro.setStatus(404L);
			erro.setTitulo(e.getMessage());
			erro.setMensagemDesenvolvedor("Confira se a URI/ID ou outros parâmetros estão corretos");
			erro.setTimestamp(System.currentTimeMillis());

			//retorna not found(404) e constroi o corpo com os detalhes do erro
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);		
		}
}
