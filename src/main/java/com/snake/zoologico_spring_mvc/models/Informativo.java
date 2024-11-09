package com.snake.zoologico_spring_mvc.models;

public abstract class Informativo {

    private static int contador = 0;
    private int id;
    private String nomePopular;
    private int idade;
    private String imagemUrl;
    private String sexo;
    private String video;

    public Informativo() {}

    public Informativo(
            String nomePopular,
            int idade,
            String imagemUrl,
            String sexo,
            String video) {
        this.nomePopular = nomePopular;
        this.idade = idade;
        this.imagemUrl = imagemUrl;
        this.sexo = sexo;
        this.video = video;
        this.id = contador++;
    }

    public int getId() {
        return this.id;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
