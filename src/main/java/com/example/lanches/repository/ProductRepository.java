package com.example.lanches.repository; // Ajuste o pacote


import com.example.lanches.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Método mágico: busca produtos onde promoPrice é maior que o valor passado
    List<Product> findByPromoPriceGreaterThan(BigDecimal price);
    // O JpaRepository já vem com findAll(), save(), etc. prontos
}