package com.lima.tibere.robo.direcao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DireitaTest {

    @Test
    public void testAtualizarOrientacao() {
        System.out.println("atualizarOrientacao");
        Orientacao orientacao = Orientacao.NORTE;
        Direita instance = new Direita();
        Orientacao expResult = Orientacao.LESTE;
        Orientacao result = instance.atualizarOrientacao(orientacao);
        assertEquals(expResult, result);
    }
}
