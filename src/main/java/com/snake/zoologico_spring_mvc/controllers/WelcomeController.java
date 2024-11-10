package com.snake.zoologico_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public String showWelcomePage(Model model) {
        model.addAttribute("title", "Bem-vindo ao Zoo");
        return "welcome"; // Nome da página HTML "welcome.html" no diretório de templates
    }

    @GetMapping("/perfilLeigo")
    public String redirectToPerfilLeigoController() {
        return "redirect:/animais1"; // Redireciona para a URL que será gerenciada pela controller de perfil Leigo
    }

    @GetMapping("/perfilTecnico")
    public String redirectToPerfilTecnicoController() {
        return "redirect:/animais2"; // Redireciona para a URL que será gerenciada pela controller de perfil Técnico
    }

}
