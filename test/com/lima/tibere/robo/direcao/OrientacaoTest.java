package com.lima.tibere.robo.direcao;

import static org.junit.Assert.*;
import org.junit.Test;

public class OrientacaoTest {

    @Test
    public void test() {
        assertEquals(3, Orientacao.LESTE.getI());
        assertEquals(12, Orientacao.NORTE.getI());
        assertEquals(9, Orientacao.OESTE.getI());
        assertEquals(6, Orientacao.SUL.getI());
    }
}
