package com.gubeetecnologia.produtos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.gubeetecnologia.produtos.model.Product;
import com.gubeetecnologia.produtos.model.TargetMarket;
import com.gubeetecnologia.produtos.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAllProducts(){
        return this.productRepository.findAll();
    }

    public List<Product> getProductsByStack(List<String> stacks){
        List<Product> auxProducts = new ArrayList<Product>();

        for( String stack : stacks){
            Long id = Long.parseLong(stack);
            auxProducts.addAll(this.productRepository.getProductsByStack(id));
        }

        List<Product> products = auxProducts.stream().distinct().collect(Collectors.toList());

        return products;
    }

    public List<Product> getProductsByTargetMarkets(List<String> ids){
        List<Product> auxProducts = new ArrayList<Product>();

        for( String targeMarket : ids){
            Long id = Long.parseLong(targeMarket);
            auxProducts.addAll(this.productRepository.getProductsByTargetMarkets(id));
        }

        List<Product> products = auxProducts.stream().distinct().collect(Collectors.toList());

        return products;
    }
}
