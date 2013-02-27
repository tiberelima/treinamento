package com.lima.tibere.robo;

import com.lima.tibere.robo.comando.Comando;
import com.lima.tibere.robo.direcao.Orientacao;

public class Robo {

    private String nome;
    private Orientacao orientacao;

    public Robo(String nome, Orientacao orientacao) {
        this.nome = nome;
        this.orientacao = orientacao;
    }

    public Robo execute(Comando comando) {
        return new Robo(nome, comando.play(orientacao));
    }

    public String getNome() {
        return nome;
    }

    public Orientacao getOrientacao() {
        return orientacao;
    }
}
