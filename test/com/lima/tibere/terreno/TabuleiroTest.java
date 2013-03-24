package com.lima.tibere.terreno;

import com.lima.tibere.robo.ObjetoDeCenario;
import com.lima.tibere.robo.Robo;
import com.lima.tibere.robo.direcao.Orientacao;
import org.junit.Assert;
import org.junit.Test;

public class TabuleiroTest {

    public TabuleiroTest() {
    }

    @Test
    public void testInserirObjeto() {
        ObjetoDeCenario objeto = new Robo("R2D2", Orientacao.NORTE, 0, 0);
        Tabuleiro instance = new Tabuleiro(0, 0);
        instance.inserirObjeto(objeto);

        Assert.assertEquals(objeto, instance.getRobos().get(0));

    }
}
