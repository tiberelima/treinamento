package com.lima.tibere.parser;

import static org.junit.Assert.*;
import org.junit.Test;

public class UnderLineTest {

    @Test
    public void testParse() {
        System.out.println("parse");
        String string = "__palavra__";
        UnderLine instance = new UnderLine();
        String expResult = "<u>palavra</u>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
}
