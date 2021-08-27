package com.gubeetecnologia.produtos.repository;

import com.gubeetecnologia.produtos.model.Stack;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StackRepository extends JpaRepository<Stack, Long> {
    
}
