package com.lima.tibere.parser;

import sun.misc.Regexp;

public class Italic extends AbstractParser {

    @Override
    public String parse(String string) {
        return super.parser(string, "//", "i", new Regexp("[/][/]"));
    }
}
