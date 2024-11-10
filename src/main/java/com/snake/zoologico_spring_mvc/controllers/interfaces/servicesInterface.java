package com.snake.zoologico_spring_mvc.controllers.interfaces;

import com.snake.zoologico_spring_mvc.models.Informativo;

import java.util.List;

public interface servicesInterface {
    public void adicionarAnimal(Informativo animal);

    public List<Informativo> getAnimais();

    public Informativo getAnimalById(int id);
}
