package com.lima.tibere.robo;

import com.lima.tibere.robo.comando.Andar;
import com.lima.tibere.robo.comando.Comando;
import com.lima.tibere.robo.comando.Virar;
import com.lima.tibere.robo.direcao.Direita;
import com.lima.tibere.robo.direcao.Esquerda;
import com.lima.tibere.robo.direcao.Orientacao;
import static org.junit.Assert.*;
import org.junit.Test;

public class RoboTest {

    private Robo robo;

    public RoboTest() {
        robo = new Robo("R2D2", Orientacao.LESTE);
    }

    @Test
    public void testExecute() {
        System.out.println("execute");
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

    }
}
