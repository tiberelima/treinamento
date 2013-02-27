package com.lima.tibere.parser;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParserTest {

    @Test
    public void testParse() {
        System.out.println("parse");
        String string = "__um **exemplo //qualquer//**__";
        String expResult = "<u>um <b>exemplo <i>qualquer</i></b></u>";

        String result = new Bold().parse(string);
        result = new Italic().parse(result);
        result = new UnderLine().parse(result);

        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testParseSemFechamento() {
        System.out.println("parse");
        String string = "__um **exemplo //qualquer//__";
        String expResult = "<u>um **exemplo <i>qualquer</i></u>";

        String result = new Bold().parse(string);
        result = new Italic().parse(result);
        result = new UnderLine().parse(result);

        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
}
