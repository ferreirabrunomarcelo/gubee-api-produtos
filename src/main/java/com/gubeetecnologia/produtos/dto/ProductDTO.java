package com.gubeetecnologia.produtos.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.gubeetecnologia.produtos.model.Product;

public class ProductDTO {
    private String productName;
    private String description;
    private List<String> targetMarkets;
    private List<String> stacks;
    
    public ProductDTO(Product product){
        this.setProductName(product.getProductName());
        this.setDescription(product.getDescription());
        this.targetMarkets = product.getTargetMarkets().stream().map(ptm -> ptm.getDescription()).collect(Collectors.toList());
        this.stacks = product.getStack().stream().map(ps -> ps.getDescription()).collect(Collectors.toList());
    }

    /**
     * @return String return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return List<String> return the targetMarkets
     */
    public List<String> getTargetMarkets() {
        return targetMarkets;
    }

    /**
     * @param targetMarkets the targetMarkets to set
     */
    public void setTargetMarkets(List<String> targetMarkets) {
        this.targetMarkets = targetMarkets;
    }


    /**
     * @return List<String> return the stacks
     */
    public List<String> getStacks() {
        return stacks;
    }

    /**
     * @param stacks the stacks to set
     */
    public void setStacks(List<String> stacks) {
        this.stacks = stacks;
    }

}
