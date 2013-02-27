package com.lima.tibere.robo.direcao;

public enum Orientacao {

    NORTE(12),
    LESTE(3),
    SUL(6),
    OESTE(9);
    private int i;

    Orientacao(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}
