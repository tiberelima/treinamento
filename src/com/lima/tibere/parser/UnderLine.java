package com.lima.tibere.parser;

import sun.misc.Regexp;

public class UnderLine extends AbstractParser {

    @Override
    public String parse(String string) {
        return super.parser(string, "__", "u", new Regexp("[_][_]"));
    }
}
