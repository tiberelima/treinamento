package com.lima.tibere.robo.direcao;

public class Esquerda implements Direcao {

    @Override
    public String getValue() {
        return "Esquerda";
    }

    @Override
    public Orientacao atualizarOrientacao(Orientacao orientacao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
