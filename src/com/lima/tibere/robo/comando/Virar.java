package com.lima.tibere.robo.comando;

import com.lima.tibere.robo.direcao.Direcao;

public class Virar implements Comando {

    private static Comando instance;
    private static Direcao direcao;

    private Virar() {
    }

    public static Comando getInstance(Direcao direcao) {
        Virar.direcao = direcao;
        if (instance == null) {
            instance = new Virar();
        }
        return instance;
    }

    @Override
    public void play() {
        System.out.println("Virar " + direcao.getValue());
    }
}
