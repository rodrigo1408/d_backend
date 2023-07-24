package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.ClienteEntity;

@Repository
public interface ClienteRepository  extends JpaRepository<ClienteEntity, Integer>{ 
}
