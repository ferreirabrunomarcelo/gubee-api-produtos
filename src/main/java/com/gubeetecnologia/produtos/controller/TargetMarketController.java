package com.gubeetecnologia.produtos.controller;

import java.util.List;

import com.gubeetecnologia.produtos.model.TargetMarket;
import com.gubeetecnologia.produtos.service.TargetMarketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TargetMarketController {
    
    @Autowired
    private TargetMarketService targetMarketService;

    @GetMapping("/api/v1/targetMarkets")
    List<TargetMarket> getAllTargetMarket(){
        return targetMarketService.getAllTargetMarket();
    }
}
