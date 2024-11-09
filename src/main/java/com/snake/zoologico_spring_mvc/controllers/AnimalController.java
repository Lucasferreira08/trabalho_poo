package com.snake.zoologico_spring_mvc.controllers;

import com.snake.zoologico_spring_mvc.controllers.services.AnimalService;
import com.snake.zoologico_spring_mvc.models.Animal;
import com.snake.zoologico_spring_mvc.models.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnimalController {

//    @GetMapping("/animal")
//    public String animalForm(Model model) {
//        model.addAttribute("animal", new Animal());
//        return "animal";
//    }
//
//    @PostMapping("/animal")
//    public String animalSubmit(@ModelAttribute Animal animal, Model model) {
//        model.addAttribute("animal", animal);
//        return "listaAnimais";
//    }

//    private final AnimalService animalService;
//
//    @Autowired
//    public AnimalController(AnimalService animalService) {
//        this.animalService = animalService;
//    }
//
//    // Endpoint para exibir o formulário de cadastro
//    @GetMapping("/animal/cadastro")
//    public String exibirFormularioCadastro(Model model) {
//        model.addAttribute("animal", new Animal()); // Cria um novo objeto Animal vazio para o formulário
//        return "cadastroAnimal"; // Nome do template HTML para o formulário
//    }

    // Endpoint para salvar o animal cadastrado
//    @PostMapping("/animal/salvar")
//    public String salvarAnimal(@ModelAttribute Animal animal) {
//        animalService.adicionarAnimal(animal); // Salva o animal na lista
//        return "redirect:/animais"; // Redireciona para a lista de animais
//    }
//
//    // Endpoint para exibir a lista de animais
//    @GetMapping("/animais")
//    public String listarAnimais(Model model) {
//        model.addAttribute("animais", animalService.getAnimais()); // Pega a lista de animais e passa para o modelo
//        return "listaAnimais"; // Nome do template HTML para exibir a lista
//    }
}
