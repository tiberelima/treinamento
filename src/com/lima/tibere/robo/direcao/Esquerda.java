package com.lima.tibere.robo.direcao;

public class Esquerda implements Direcao {

    @Override
    public String getValue() {
        return "Esquerda";
    }

    @Override
    public Orientacao atualizarOrientacao(Orientacao orientacao) {
        int i = orientacao.getValor();
        if (i > 3) {
            i -= 3;
        } else {
            i = 12;
        }
        return Orientacao.getOrientacaoPeloValor(i);
    }
}
