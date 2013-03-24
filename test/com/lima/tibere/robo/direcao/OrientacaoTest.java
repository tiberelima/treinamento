package com.lima.tibere.robo.direcao;

import static org.junit.Assert.*;
import org.junit.Test;

public class OrientacaoTest {
    
    @Test
    public void testVoltaSentidoHorario() {
        assertEquals(Orientacao.LESTE, Orientacao.novaOrientacao(Orientacao.NORTE, new Direita()));
        assertEquals(Orientacao.SUL, Orientacao.novaOrientacao(Orientacao.LESTE, new Direita()));
        assertEquals(Orientacao.OESTE, Orientacao.novaOrientacao(Orientacao.SUL, new Direita()));
        assertEquals(Orientacao.NORTE, Orientacao.novaOrientacao(Orientacao.OESTE, new Direita()));
    }
    
    @Test
    public void testVoltaSentidoAntiHorario() {
        assertEquals(Orientacao.OESTE, Orientacao.novaOrientacao(Orientacao.NORTE, new Esquerda()));
        assertEquals(Orientacao.SUL, Orientacao.novaOrientacao(Orientacao.OESTE, new Esquerda()));
        assertEquals(Orientacao.LESTE, Orientacao.novaOrientacao(Orientacao.SUL, new Esquerda()));
        assertEquals(Orientacao.NORTE, Orientacao.novaOrientacao(Orientacao.LESTE, new Esquerda()));
    }
}
