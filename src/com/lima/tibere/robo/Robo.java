package com.lima.tibere.robo;

import com.lima.tibere.observer.Observavel;
import com.lima.tibere.robo.comando.Andar;
import com.lima.tibere.robo.comando.Comando;
import com.lima.tibere.robo.direcao.Orientacao;
import com.lima.tibere.terreno.ForaDeTerrenoException;

public class Robo extends Observavel implements ObjetoDeCenario {

    private final String nome;
    private final Orientacao orientacao;
    private int coordenadaX;
    private int coordenadaY;
    private int coordenadaXOld;
    private int coordenadaYOld;

    public Robo(String nome, Orientacao orientacao, int x, int y) {
        this.nome = nome;
        this.orientacao = orientacao;
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    public Robo execute(Comando comando) {
        Orientacao novaOrientacao = comando.play(this.orientacao);
        if (comando instanceof Andar) {
            this.deslocar();
            try {
                this.notificarObservadores();
            } catch (ForaDeTerrenoException ex) {
                System.out.println(ex.getMessage());
                return this.reverterAcao();
            }
        }
        return new Robo(nome, novaOrientacao, coordenadaX, coordenadaX);
    }

    private void deslocar() {
        coordenadaXOld = coordenadaX;
        coordenadaYOld = coordenadaY;
        if (orientacao.equals(Orientacao.LESTE)) {
            coordenadaX++;
        }
        if (orientacao.equals(Orientacao.OESTE)) {
            coordenadaX--;
        }
        if (orientacao.equals(Orientacao.NORTE)) {
            coordenadaY++;
        }
        if (orientacao.equals(Orientacao.SUL)) {
            coordenadaY--;
        }
    }

    public String getNome() {
        return nome;
    }

    public Orientacao getOrientacao() {
        return orientacao;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public Robo reverterAcao() {
        return new Robo(nome, orientacao, coordenadaXOld, coordenadaYOld);
    }
}
