package com.gubeetecnologia.produtos.service;

import java.util.List;

import com.gubeetecnologia.produtos.model.Stack;
import com.gubeetecnologia.produtos.repository.StackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StackService {
    
    @Autowired
    private StackRepository stackRepository;

    public List<Stack> getAllStacks(){
        
        return stackRepository.findAll();
     }
}
