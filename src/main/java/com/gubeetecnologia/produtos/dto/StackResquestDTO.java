package com.gubeetecnologia.produtos.dto;

import java.util.List;

import com.gubeetecnologia.produtos.model.Stack;

public class StackResquestDTO {
    private List<Stack> stacks;
    
    /**
     * @return List<Stack> return the stacks
     */
    public List<Stack> getStacks() {
        return stacks;
    }

    /**
     * @param stacks the stacks to set
     */
    public void setStacks(List<Stack> stacks) {
        this.stacks = stacks;
    }

}
