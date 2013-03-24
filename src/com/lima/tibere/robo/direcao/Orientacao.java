package com.lima.tibere.robo.direcao;

public enum Orientacao {

    NORTE("OESTE", "LESTE"),
    LESTE("NORTE", "SUL"),
    SUL("LESTE", "OESTE"),
    OESTE("SUL", "NORTE");
    private String esquerda;
    private String direita;

    Orientacao(String esquerda, String direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public static Orientacao novaOrientacao(Orientacao orientacao, Direcao direcao) {
        if (direcao instanceof Direita) {
            return Orientacao.valueOf(orientacao.direita);
        }
        return Orientacao.valueOf(orientacao.esquerda);
    }
}
