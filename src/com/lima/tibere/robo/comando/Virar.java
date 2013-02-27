package com.lima.tibere.robo.comando;

import com.lima.tibere.robo.direcao.Direcao;
import com.lima.tibere.robo.direcao.Orientacao;

public class Virar implements Comando {

    private Direcao direcao;

    public Virar(Direcao direcao) {
        this.direcao = direcao;
    }

    @Override
    public Orientacao play(Orientacao orientacao) {
        System.out.println("Virar " + direcao.getValue());
        return direcao.atualizarOrientacao(orientacao);
    }
}
