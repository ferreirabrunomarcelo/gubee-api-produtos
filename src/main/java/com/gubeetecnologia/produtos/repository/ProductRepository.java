package com.gubeetecnologia.produtos.repository;

import java.util.List;

import com.gubeetecnologia.produtos.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
    @Query(
        value = "SELECT * FROM product INNER JOIN product_stack ps ON ps.product_id = product.id INNER JOIN stack ON " +
        "ps.stack_id = stack.id AND stack.id = :idStack",
        nativeQuery = true
    )
    public List<Product> getProductsByStack(@Param("idStack") Long id);

    @Query(
        value = "SELECT * FROM product INNER JOIN product_target_market ptm ON ptm.product_id = product.id INNER JOIN target_market ON " +
        "ptm.target_market_id = target_market.id AND target_market.id = :idTargetMarket",
        nativeQuery = true
    )
    public List<Product> getProductsByTargetMarkets(@Param("idTargetMarket") Long id);
}
