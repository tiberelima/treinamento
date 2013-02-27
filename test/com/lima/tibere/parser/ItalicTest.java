package com.lima.tibere.parser;

import static org.junit.Assert.*;
import org.junit.Test;

public class ItalicTest {

    @Test
    public void testParse() {
        System.out.println("parse");
        String string = "//palavra//";
        Italic instance = new Italic();
        String expResult = "<i>palavra</i>";
        String result = instance.parse(string);
        System.out.println(string);
        System.out.println(result);
        assertEquals(expResult, result);
    }
}
