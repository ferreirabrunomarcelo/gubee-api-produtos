package com.gubeetecnologia.produtos.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.gubeetecnologia.produtos.dto.ProductDTO;
import com.gubeetecnologia.produtos.dto.TargetMarketRequestDTO;
import com.gubeetecnologia.produtos.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/api/v1/products")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = this.productService.getAllProducts().stream().map(ProductDTO::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/api/v1/products/stack")
    public ResponseEntity<List<ProductDTO>> getProductsByStack(@RequestParam List<String> ids) {
        System.out.println(ids);
        List<ProductDTO> productDTOs = this.productService.getProductsByStack(ids).stream().map(ProductDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(productDTOs);
    }

    @GetMapping("/api/v1/products/targetMarket")
    public ResponseEntity<List<ProductDTO>> getProductsByTargetMarket(@RequestParam List<String> ids) {

        List<ProductDTO> productDTOs = this.productService
                .getProductsByTargetMarkets(ids).stream().map(ProductDTO::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(productDTOs);
    }
}
