package com.lima.tibere.robo;

import com.lima.tibere.robo.comando.Comando;
import com.lima.tibere.robo.direcao.Orientacao;

public class Robo {

    private String nome;
    private Orientacao orientacao;

    public Robo(String nome) {
        this.nome = nome;
    }

    public Robo execute(Comando comando) {
        System.out.println("Orientação atual: " + getOrientacao());
        System.out.print(nome + " executando comando: ");
        this.setOrientacao(comando.play(getOrientacao()));
        return this;
    }

    public Robo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Orientacao getOrientacao() {
        return orientacao;
    }

    public Robo setOrientacao(Orientacao orientacao) {
        this.orientacao = orientacao;
        return this;
    }
}
