package com.gubeetecnologia.produtos.dto;

import java.util.List;

import com.gubeetecnologia.produtos.model.TargetMarket;

public class TargetMarketRequestDTO {
    private List<TargetMarket> targetMarkets;

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

}
