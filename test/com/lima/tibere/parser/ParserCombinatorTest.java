package com.lima.tibere.parser;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;

public class ParserCombinatorTest {

    @Test
    public void testParseCombinado() {
        System.out.println("parseCombinado");
        List<String> strings = new ArrayList<>();
        strings.add("**palavra**");
        strings.add("//palavra//");
        strings.add("__palavra__");
        strings.add("__um **exemplo //qualquer//**__");

        List<Parser> parsers = new ArrayList<>();
        parsers.add(new Bold());
        parsers.add(new Italic());
        parsers.add(new UnderLine());

        List expResult = new ArrayList<>();
        expResult.add("<b>palavra</b>");
        expResult.add("<i>palavra</i>");
        expResult.add("<u>palavra</u>");
        expResult.add("<u>um <b>exemplo <i>qualquer</i></b></u>");

        List result = new ParserCombinator().parseCombinado(strings, parsers);

        assertEquals(expResult, result);
    }

    @Test
    public void testParseCombinadoTextoLongo() {
        System.out.println("parseCombinado");
        List<String> strings = new ArrayList<>();
        
        strings.add("__um **exemplo //qualquer//**__"   
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__"
                + "__um **exemplo //qualquer//**__");

        List<Parser> parsers = new ArrayList<>();
        parsers.add(new Bold());
        parsers.add(new Italic());
        parsers.add(new UnderLine());

        List expResult = new ArrayList<>();        
               
        expResult.add("<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>"
                + "<u>um <b>exemplo <i>qualquer</i></b></u>");

        List result = new ParserCombinator().parseCombinado(strings, parsers);

        assertEquals(expResult, result);
    }
}
