package com.snake.zoologico_spring_mvc.models;

import java.util.ArrayList;

public class Animal {

    private String nomeCientifico;
    private String nomesPopulares;
    private String habitoAlimentar;
    private String distribuicaoGeografica;
    private int expectativaNatureza;
    private int expectativaCativeiro;
    private String comportamento; //(se vive em bando, quantos no bando, solitário...)
    private String epocaReproducao;
    private String imagemUrl;

    public Animal() {}

    public Animal(String nomeCientifico,
                  String nomesPopulares,
                  String habitoAlimentar,
                  String distribuicaoGeografica,
                  int expectativaNatureza,
                  int expectativaCativeiro,
                  String comportamento,
                  String epocaReproducao) {
        this.nomeCientifico = nomeCientifico;
        this.nomesPopulares = nomesPopulares;
        this.habitoAlimentar = habitoAlimentar;
        this.distribuicaoGeografica = distribuicaoGeografica;
        this.expectativaNatureza = expectativaNatureza;
        this.expectativaCativeiro = expectativaCativeiro;
        this.comportamento = comportamento;
        this.epocaReproducao = epocaReproducao;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomesPopulares() {
        return nomesPopulares;
    }

    public void setNomesPopulares(String nomesPopulares) {
        this.nomesPopulares = nomesPopulares;
    }

    public String getHabitoAlimentar() {
        return habitoAlimentar;
    }

    public void setHabitoAlimentar(String habitoAlimentar) {
        this.habitoAlimentar = habitoAlimentar;
    }

    public String getDistribuicaoGeografica() {
        return distribuicaoGeografica;
    }

    public void setDistribuicaoGeografica(String distribuicaoGeografica) {
        this.distribuicaoGeografica = distribuicaoGeografica;
    }

    public int getExpectativaNatureza() {
        return expectativaNatureza;
    }

    public void setExpectativaNatureza(int expectativaNatureza) {
        this.expectativaNatureza = expectativaNatureza;
    }

    public int getExpectativaCativeiro() {
        return expectativaCativeiro;
    }

    public void setExpectativaCativeiro(int expectativaCativeiro) {
        this.expectativaCativeiro = expectativaCativeiro;
    }

    public String getComportamento() {
        return comportamento;
    }

    public void setComportamento(String comportamento) {
        this.comportamento = comportamento;
    }

    public String getEpocaReproducao() {
        return epocaReproducao;
    }

    public void setEpocaReproducao(String epocaReproducao) {
        this.epocaReproducao = epocaReproducao;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }

}
