package com.lima.tibere.robo.direcao;

public class Direita implements Direcao {

    @Override
    public String getValue() {
        return "Direita";
    }

    @Override
    public Orientacao atualizarOrientacao(Orientacao orientacao) {
        int i = orientacao.getI();
        if (i < 12) {
            i += 3;
        } else {
            i = 3;
        }
        System.out.println("orientação: " + i);
        return Orientacao.SUL;
    }
}
