package com.example.lanches.repository; // Ajuste o pacote


import com.example.lanches.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // O JpaRepository já vem com findAll(), save(), etc. prontos
}