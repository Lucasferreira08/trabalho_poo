package com.snake.zoologico_spring_mvc.controllers;

import com.snake.zoologico_spring_mvc.controllers.services.AnimalLegService;
import com.snake.zoologico_spring_mvc.controllers.services.AnimalTecService;
import com.snake.zoologico_spring_mvc.models.Informativo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CatalogoTecnicoController {

    private final AnimalTecService animalService;

    @Autowired
    public CatalogoTecnicoController(AnimalTecService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animais2")
    public String listarAnimais(Model model) {
        model.addAttribute("animais", animalService.getAnimais()); // Pega a lista de animais e passa para o modelo
        return "catalogoTec"; // Nome do template HTML para exibir a lista
    }

    @GetMapping("/animais2/details/{id}")
    public String detalhesAnimal(@PathVariable("id") int id, Model model) {
        Informativo animal = animalService.getAnimalById(id); // Busca o animal pelo ID
        if (animal == null) {
            return "redirect:/animais2"; // Redireciona para a lista se o animal não existir
        }
        model.addAttribute("animal", animal); // Adiciona o animal ao modelo
        model.addAttribute("title", "Detalhes do Animal: " + animal.getNomePopular()); // Define o título da página
        return "detalhesTec"; // Retorna a view 'detalhesLeigo.html'
    }

}
