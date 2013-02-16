package com.lima.tibere.robo.comando;

import com.lima.tibere.robo.direcao.Orientacao;

public class Andar implements Comando {

    @Override
    public Orientacao play(Orientacao orientacao) {
        System.out.println("Andar");
        return orientacao;
    }
}
