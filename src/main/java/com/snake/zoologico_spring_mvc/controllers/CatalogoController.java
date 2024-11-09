package com.snake.zoologico_spring_mvc.controllers;

import com.snake.zoologico_spring_mvc.controllers.services.AnimalService;
import com.snake.zoologico_spring_mvc.models.Informativo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/animais")
public class CatalogoController {

    private final AnimalService animalService;

    @Autowired
    public CatalogoController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animais")
    public String listarAnimais(Model model) {
        model.addAttribute("animais", animalService.getAnimais()); // Pega a lista de animais e passa para o modelo
        return "catalogo"; // Nome do template HTML para exibir a lista
    }

    @GetMapping("animais/details/{id}")
    public String detalhesAnimal(@PathVariable("id") int id, Model model) {
        Informativo animal = animalService.getAnimalById(id); // Busca o animal pelo ID
        if (animal == null) {
            return "redirect:/animais"; // Redireciona para a lista se o animal não existir
        }
        model.addAttribute("animal", animal); // Adiciona o animal ao modelo
        model.addAttribute("title", "Detalhes do Animal: " + animal.getNomePopular()); // Define o título da página
        return "Detalhes"; // Retorna a view 'Detalhes.html'
    }
}
