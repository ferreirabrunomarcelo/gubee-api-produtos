package com.gubeetecnologia.produtos.controller;

import java.util.List;

import com.gubeetecnologia.produtos.model.Stack;
import com.gubeetecnologia.produtos.service.StackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StackController {
    
    @Autowired
    private StackService stackService;

    @GetMapping("/api/v1/stacks")
    List<Stack> getAllStacks(){
        return stackService.getAllStacks();
    }
}
