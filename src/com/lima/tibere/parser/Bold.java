package com.lima.tibere.parser;

import sun.misc.Regexp;

public class Bold extends AbstractParser {

    @Override
    public String parse(String string) {
        return super.parser(string, "**", "b", new Regexp("[*][*]"));
    }
}
