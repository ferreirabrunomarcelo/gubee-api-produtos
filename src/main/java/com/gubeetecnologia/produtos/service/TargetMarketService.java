package com.gubeetecnologia.produtos.service;

import java.util.List;

import com.gubeetecnologia.produtos.model.TargetMarket;
import com.gubeetecnologia.produtos.repository.TargetMarketRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TargetMarketService {
    
    @Autowired
    private TargetMarketRepository targetMarketRepository;

    public List<TargetMarket> getAllTargetMarket(){
        return targetMarketRepository.findAll();
    }
}
