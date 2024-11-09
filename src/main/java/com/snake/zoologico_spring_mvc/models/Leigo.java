package com.snake.zoologico_spring_mvc.models;

public class Leigo extends Informativo {

    private String historia;
    private String curiosidade;

    public Leigo(String nomePopular, int idade, String imagemUrl, String video, String sexo, String historia, String curiosidade) {
        super(nomePopular, idade, imagemUrl, sexo, video);
        this.historia = historia;
        this.curiosidade = curiosidade;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getCuriosidade() {
        return curiosidade;
    }

    public void setCuriosidade(String curiosidade) {
        this.curiosidade = curiosidade;
    }
}
