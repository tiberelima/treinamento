package com.lima.tibere.robo.direcao;

public class Direita implements Direcao {

    private static Direcao instance;

    private Direita() {
    }

    public static Direcao virar() {
        if (instance == null) {
            instance = new Direita();
        }
        return instance;
    }

    @Override
    public String getValue() {
        return "Direita";
    }
}
