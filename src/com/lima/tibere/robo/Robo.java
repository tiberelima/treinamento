package com.lima.tibere.robo;

import com.lima.tibere.robo.comando.Comando;

public class Robo {

    private String nome;

    public Robo() {
    }

    public Robo execute(Comando comando) {
        System.out.print(nome + " executando comando: ");
        comando.play();
        return this;
    }

    public Robo setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNome() {
        return nome;
    }
}
