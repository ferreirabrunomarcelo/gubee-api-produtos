package com.gubeetecnologia.produtos.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Product {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private String description;
    
    @ManyToMany
    @JoinTable(
        name = "product_target_market", 
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "target_market_id")
    )
    private List<TargetMarket> targetMarkets;

    @ManyToMany
    @JoinTable(
        name = "product_stack",
        joinColumns = @JoinColumn(name = "product_id"),
        inverseJoinColumns = @JoinColumn(name = "stack_id")
    )
    private List<Stack> stack;

    public Product(){

    }
    
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return List<TargetMarket> return the targetMarkets
     */
    public List<TargetMarket> getTargetMarkets() {
        return targetMarkets;
    }

    /**
     * @param targetMarkets the targetMarkets to set
     */
    public void setTargetMarkets(List<TargetMarket> targetMarkets) {
        this.targetMarkets = targetMarkets;
    }

    /**
     * @return List<Stack> return the stack
     */
    public List<Stack> getStack() {
        return stack;
    }

    /**
     * @param stack the stack to set
     */
    public void setStack(List<Stack> stack) {
        this.stack = stack;
    }

}
