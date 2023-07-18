package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository  extends JpaRepository<UsuarioEntity, Integer>{ 
}
