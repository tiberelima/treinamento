package com.lima.tibere.robo.direcao;

public enum Orientacao {

    NORTE(12),
    LESTE(3),
    SUL(6),
    OESTE(9);
    private int valor;

    Orientacao(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static Orientacao getOrientacaoPeloValor(int valor) {
        if (valor == 3) {
            return LESTE;
        }
        if (valor == 6) {
            return SUL;
        }
        if (valor == 9) {
            return OESTE;
        }
        if (valor == 12) {
            return NORTE;
        }
        return null;
    }
}
