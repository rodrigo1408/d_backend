package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.ProdPedidoEntity;

@Repository
public interface ProdPedidoRepository extends JpaRepository<ProdPedidoEntity, Integer>{

}
