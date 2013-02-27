package com.lima.tibere.robo.comando;

import com.lima.tibere.robo.direcao.Orientacao;
import static org.junit.Assert.*;
import org.junit.Test;

public class AndarTest {
    
    public AndarTest() {
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        Orientacao orientacao = Orientacao.LESTE;
        Andar instance = new Andar();
        Orientacao expResult = Orientacao.LESTE;
        Orientacao result = instance.play(orientacao);
        assertEquals(expResult, result);
        
    }
}
