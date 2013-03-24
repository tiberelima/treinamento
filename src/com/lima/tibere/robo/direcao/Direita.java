package com.lima.tibere.robo.direcao;

public class Direita implements Direcao {

    @Override
    public String getValue() {
        return "Direita";
    }

    @Override
    public Orientacao atualizarOrientacao(Orientacao orientacao) {
        return Orientacao.novaOrientacao(orientacao, this);
    }
}
