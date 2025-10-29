package com.example.lanches.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/cardapio")
    public String cardapio(Model model) {
        return "cardapio";
    }

    @GetMapping("/promocoes")
    public String promocoes(Model model) { return "promocoes";}

    @GetMapping("/pedido")
    public String pedido(Model model) { return "pedido";}

    @GetMapping("/contato")
    public String contato(Model model) {return "contato";}

    @GetMapping("/privacidade")
    public String privacidade(Model model) {return "privacidade";}


}

