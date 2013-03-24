package com.lima.tibere.robo;

import com.lima.tibere.robo.comando.Andar;
import com.lima.tibere.robo.comando.Comando;
import com.lima.tibere.robo.comando.Virar;
import com.lima.tibere.robo.direcao.Direita;
import com.lima.tibere.robo.direcao.Esquerda;
import com.lima.tibere.robo.direcao.Orientacao;
import com.lima.tibere.terreno.Tabuleiro;
import com.lima.tibere.terreno.Terreno;
import static org.junit.Assert.*;
import org.junit.Test;

public class RoboTest {

    private Robo robo;
    private Terreno tabuleiro;

    public RoboTest() {
        robo = new Robo("R2D2", Orientacao.LESTE, 0, 0);
        tabuleiro = new Tabuleiro(0, 0);
        tabuleiro.inserirObjeto(robo);
        robo.serObservadoPor(tabuleiro);
    }

    @Test
    public void lancandoExecao() {
        Terreno t = new Tabuleiro(5, 5);
        Robo r = new Robo("teste", Orientacao.NORTE, 0, 0);
        r.serObservadoPor(t);
        t.inserirObjeto(r);
        r.execute(new Andar());
    }

    @Test
    public void testExecute() {
        Comando comando = new Andar();

        Orientacao expResult = Orientacao.LESTE;
        robo = robo.execute(comando);
        assertEquals(expResult, robo.getOrientacao());

        expResult = Orientacao.SUL;
        comando = new Virar(new Direita());
        robo = robo.execute(comando);
        assertEquals(expResult, robo.getOrientacao());

        expResult = Orientacao.LESTE;
        comando = new Virar(new Esquerda());
        robo = robo.execute(comando);
        assertEquals(expResult, robo.getOrientacao());

        robo = robo.execute(new Andar());
        assertEquals(expResult, robo.getOrientacao());

        expResult = Orientacao.NORTE;
        comando = new Virar(new Esquerda());
        robo = robo.execute(comando);
        assertEquals(expResult, robo.getOrientacao());

        expResult = Orientacao.OESTE;
        comando = new Virar(new Esquerda());
        robo = robo.execute(comando);
        assertEquals(expResult, robo.getOrientacao());

        robo = robo.execute(new Andar());
        assertEquals(expResult, robo.getOrientacao());

        robo = robo.execute(new Andar());
        assertEquals(expResult, robo.getOrientacao());

        robo = robo.execute(new Andar());
        assertEquals(expResult, robo.getOrientacao());
    }
}
