package com.lima.tibere.terreno;

import com.lima.tibere.robo.ObjetoDeCenario;
import com.lima.tibere.robo.Robo;
import java.util.ArrayList;
import java.util.List;

public class Tabuleiro implements Terreno {

    private List<Robo> robos;
    private int x;
    private int y;

    public Tabuleiro(int x, int y) {
        robos = new ArrayList<>();
        this.x = x;
        this.y = y;
    }

    @Override
    public void inserirObjeto(ObjetoDeCenario objeto) {
        if (objeto instanceof Robo) {
            robos.add((Robo) objeto);
        }
    }

    @Override
    public void atualizar() throws ForaDeTerrenoException {
        for (Robo robo : robos) {
            verificarLimitesDoTerreno(robo);
        }
    }

    public List<Robo> getRobos() {
        return robos;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void verificarLimitesDoTerreno(Robo robo) throws ForaDeTerrenoException {

        if (robo.getCoordenadaX() > x
                || robo.getCoordenadaY() > y
                || robo.getCoordenadaX() < 0
                || robo.getCoordenadaY() < 0) {
            throw new ForaDeTerrenoException("Impossível seguir nesta direção.\n"
                    + "Tentando acessar coordenadas {" + robo.getCoordenadaX() + ","
                    + robo.getCoordenadaY() + "}\n"
                    + "Limites do terreno {" + x + "," + y + "}");
        }
    }
}
