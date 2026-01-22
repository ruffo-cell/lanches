package com.example.lanches.model; // Ajuste para o pacote do seu projeto

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data // Gera Getters, Setters, toString, equals, hashCode (Lombok)
@NoArgsConstructor // Gera construtor vazio (obrigatório pro JPA)
@AllArgsConstructor // Gera construtor com todos os argumentos
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp // Preenche automaticamente a data ao salvar
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT") // Garante que suporte textos longos no banco
    private String description;

    private String photo;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "promo_price", precision = 10, scale = 2)
    private BigDecimal promoPrice;

    @Column(columnDefinition = "TEXT")
    private String metadata;

    // Método auxiliar opcional para verificar se está em promoção
    public boolean isPromo() {
        return promoPrice != null && promoPrice.compareTo(BigDecimal.ZERO) > 0;
    }
}