package com.example.lanches.controller;


import com.example.lanches.model.Product;
import com.example.lanches.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProductRepository productRepository; // Injeta o repositório


    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/cardapio")
    public String cardapio(Model model) {
        // Busca todos os produtos do banco
        List<Product> listaDeProdutos = productRepository.findAll();

        // Adiciona a lista ao modelo para o HTML usar
        model.addAttribute("produtos", listaDeProdutos);

        return "cardapio";
    }

    @GetMapping("/promocoes")
    public String promocoes(Model model) {
        // Busca apenas produtos com promo_price > 0
        List<Product> promos = productRepository.findByPromoPriceGreaterThan(BigDecimal.ZERO);

        model.addAttribute("promocoes", promos);
        return "promocoes";
    }

    @GetMapping("/pedido")
    public String pedido(Model model) { return "pedido";}

    @GetMapping("/contato")
    public String contato(Model model) {return "contato";}

    @GetMapping("/privacidade")
    public String privacidade(Model model) {return "privacidade";}


}

