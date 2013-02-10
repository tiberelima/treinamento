package com.lima.tibere.robo.direcao;

public class Esquerda implements Direcao {

    private static Direcao instance;

    private Esquerda() {
    }

    public static Direcao virar() {
        if (instance == null) {
            instance = new Esquerda();
        }
        return instance;
    }

    @Override
    public String getValue() {
        return "Esquerda";
    }
}
