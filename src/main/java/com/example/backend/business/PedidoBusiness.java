package com.example.backend.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.entity.PedidoEntity;
import com.example.backend.repository.PedidoRepository;

@Service
public class PedidoBusiness {

	@Autowired
	PedidoRepository pedidoRepositoy;
	
	public PedidoEntity findById(Integer id) {
		return pedidoRepositoy.findById(id).get();
	}
	
	public List<PedidoEntity> findAll() {
		return pedidoRepositoy.findAll();
	}
	
	public PedidoEntity save(PedidoEntity pedidoEntity) {
		return pedidoRepositoy.save(pedidoEntity);
	}
	
}
