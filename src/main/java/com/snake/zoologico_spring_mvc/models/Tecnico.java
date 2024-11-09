package com.snake.zoologico_spring_mvc.models;

public class Tecnico extends Informativo {

    private String nomeCientifico;
    private String reproducao;

    public Tecnico(String nomePopular, int idade, String imagemUrl, String video, String sexo, String nomeCientifico, String reproducao) {
        super(nomePopular, idade, imagemUrl, sexo, video);
        this.nomeCientifico = nomeCientifico;
        this.reproducao = reproducao;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getReproducao() {
        return reproducao;
    }

    public void setReproducao(String reproducao) {
        this.reproducao = reproducao;
    }
}
