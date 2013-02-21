package com.lima.tibere.mapper;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class LoopTest {

    @Test
    public void testMapeia() {
        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("123");
        listaDeStrings.add("123");
        listaDeStrings.add("123");

        List listaDeInteiros = new ArrayList();
        listaDeInteiros.add(123);
        listaDeInteiros.add(123);
        listaDeInteiros.add(123);

        Loop<String, Integer> stringsParaInteiros = new Loop<>();
        List<Integer> stringsMapeadaParaInteiros =
                stringsParaInteiros.mapear(listaDeStrings, new StringToInteger());

        assertEquals(listaDeInteiros, stringsMapeadaParaInteiros);

        Loop<Integer, String> inteirosParaStrings = new Loop<>();
        List<String> inteirosMapeadosParaStrings =
                inteirosParaStrings.mapear(listaDeInteiros, new IntegerToString());

        assertEquals(listaDeStrings, inteirosMapeadosParaStrings);
    }
}
