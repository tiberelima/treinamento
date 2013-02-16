package com.lima.tibere.robo.direcao;

public enum Orientacao {

    LESTE,
    SUL,
    OESTE,
    NORTE;

    public static Orientacao getOrientacao(Orientacao orientacao, Direcao direcao) {

        if (orientacao != null) {
            if (direcao.getValue().equals("Direita")) {
                switch (orientacao) {
                    case LESTE:
                        return SUL;
                    case NORTE:
                        return LESTE;
                    case OESTE:
                        return NORTE;
                    case SUL:
                        return OESTE;
                }
            }
            if (direcao.getValue().equals("Esquerda")) {
                switch (orientacao) {
                    case LESTE:
                        return NORTE;
                    case NORTE:
                        return OESTE;
                    case OESTE:
                        return SUL;
                    case SUL:
                        return LESTE;
                }
            }
        }
        return NORTE;
    }
}
