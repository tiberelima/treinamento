package com.lima.tibere.robo.comando;

import com.lima.tibere.robo.direcao.Direita;
import com.lima.tibere.robo.direcao.Esquerda;
import com.lima.tibere.robo.direcao.Orientacao;
import static org.junit.Assert.*;
import org.junit.Test;

public class VirarTest {

    public VirarTest() {
    }

    @Test
    public void testPlayVirarParaDireita() {
        Orientacao orientacao = Orientacao.NORTE;
        Virar instance = new Virar(new Direita());
        Orientacao expResult = Orientacao.LESTE;
        Orientacao result = instance.play(orientacao);
        assertEquals(expResult, result);
    }

    @Test
    public void testPlayVirarParaEsquerda() {
        Orientacao orientacao = Orientacao.NORTE;
        Virar instance = new Virar(new Esquerda());
        Orientacao expResult = Orientacao.OESTE;
        Orientacao result = instance.play(orientacao);
        assertEquals(expResult, result);
    }
}
