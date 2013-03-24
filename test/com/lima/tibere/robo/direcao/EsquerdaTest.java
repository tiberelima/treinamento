package com.lima.tibere.robo.direcao;

import static org.junit.Assert.*;
import org.junit.Test;

public class EsquerdaTest {

    @Test
    public void testAtualizarOrientacao() {
        Direcao instance = new Esquerda();

        Orientacao orientacao = Orientacao.NORTE;

        Orientacao expResult = Orientacao.OESTE;
        Orientacao result = instance.atualizarOrientacao(orientacao);
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.SUL;
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.LESTE;
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.NORTE;
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.OESTE;
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.SUL;
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.LESTE;
        assertEquals(expResult, result);

        orientacao = result;
        result = instance.atualizarOrientacao(orientacao);
        expResult = Orientacao.NORTE;
        assertEquals(expResult, result);
    }
}
