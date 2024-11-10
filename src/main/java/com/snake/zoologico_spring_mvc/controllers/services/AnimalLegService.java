package com.snake.zoologico_spring_mvc.controllers.services;
import com.snake.zoologico_spring_mvc.controllers.interfaces.servicesInterface;
import com.snake.zoologico_spring_mvc.models.Informativo;
import com.snake.zoologico_spring_mvc.models.Leigo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalLegService implements servicesInterface {

    private List<Informativo> animais = new ArrayList<>();

    public AnimalLegService() {
        this.animais.add(new Leigo("teste", 18, "https://images.pexels.com/photos/132434/pexels-photo-132434.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "n0msj0Vho9k?si=RXlJO9ni0eZHMgUH", "male", "testeImagem", "curiosidade"));
        this.animais.add(new Leigo("teste2", 18, "https://images.pexels.com/photos/15821364/pexels-photo-15821364/free-photo-of-leao-safari-perigo-risco.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "n0msj0Vho9k?si=RXlJO9ni0eZHMgUH", "testeImagem", "testeImagem", "curiosidade"));
        this.animais.add(new Leigo("teste3", 18, "https://images.pexels.com/photos/18001017/pexels-photo-18001017/free-photo-of-natureza-passaro-ave-passarinho.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "n0msj0Vho9k?si=RXlJO9ni0eZHMgUH", "testeImagem", "testeImagem", "curiosidade"));
        this.animais.add(new Leigo("teste4", 18, "https://images.pexels.com/photos/18001017/pexels-photo-18001017/free-photo-of-natureza-passaro-ave-passarinho.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "n0msj0Vho9k?si=RXlJO9ni0eZHMgUH", "testeImagem", "testeImagem", "curiosidade"));
        this.animais.add(new Leigo("teste5", 18, "https://images.pexels.com/photos/47547/squirrel-animal-cute-rodents-47547.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "n0msj0Vho9k?si=RXlJO9ni0eZHMgUH", "testeImagem", "testeImagem", "curiosidade"));
        this.animais.add(new Leigo("teste6", 18, "https://images.pexels.com/photos/62289/yemen-chameleon-chamaeleo-calyptratus-chameleon-reptile-62289.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", "n0msj0Vho9k?si=RXlJO9ni0eZHMgUH", "testeImagem", "testeImagem", "curiosidade"));
    }

    public void adicionarAnimal(Informativo animal) {
        this.animais.add(animal);
    }

    public List<Informativo> getAnimais() {
        return this.animais;
    }

    public Informativo getAnimalById(int id) {
        return this.animais.stream().filter(animal -> animal.getId() == id).findFirst().orElse(null);
    }
}
