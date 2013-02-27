package com.lima.tibere.parser;

import static org.junit.Assert.*;
import org.junit.Test;

public class BoldTest {

    public BoldTest() {
    }

    @Test
    public void testParse() {
        System.out.println("parse");
        String string = "**palavra**";
        Bold instance = new Bold();
        String expResult = "<b>palavra</b>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    @Test
    public void testParseSemCaractereEspecial() {
        System.out.println("parse");
        String string = "palavra";
        Bold instance = new Bold();
        String expResult = "palavra";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testParseSemFechamento() {
        System.out.println("parse");
        String string = "**pa**lavra**";
        Bold instance = new Bold();
        String expResult = "<b>palavra</b>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testParseTagDupla() {
        System.out.println("parse");
        String string = "**pa**la**vra**";
        Bold instance = new Bold();
        String expResult = "<b>pa</b>la<b>vra</b>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testParseTagDuplaSemFechamento() {
        System.out.println("parse");
        String string = "**pa**l**a**vra**";
        Bold instance = new Bold();
        String expResult = "<b>pa</b>la<b>vra</b>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    @Test
    public void testParse4TagsMais1SemFecha() {
        System.out.println("parse");
        String string = "**in**out**in**out**out**in**out**in**";
        Bold instance = new Bold();
        String expResult = "<b>in</b>out<b>in</b>outout<b>in</b>out<b>in</b>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    @Test
    public void testParse4TagsMais1SemFechaas() {
        System.out.println("parse");
        String string = "__um **exemplo //qualquer//**__";
        Bold instance = new Bold();
        String expResult = "__um <b>exemplo //qualquer//</b>__";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
}
