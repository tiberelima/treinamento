package com.lima.tibere.robo.direcao;

import static org.junit.Assert.*;
import org.junit.Test;

public class OrientacaoTest {

    @Test
    public void test() {
        assertEquals(3, Orientacao.LESTE.getValor());
        assertEquals(12, Orientacao.NORTE.getValor());
        assertEquals(9, Orientacao.OESTE.getValor());
        assertEquals(6, Orientacao.SUL.getValor());
    }
}
