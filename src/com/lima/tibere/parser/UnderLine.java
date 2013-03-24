package com.lima.tibere.parser;

public class UnderLine extends AbstractSimpleTagParser {

    public UnderLine() {
        tag = "u";
        regexp = "[_][_]";
        pattern = "__";
    }

    @Override
    public String parse(String string) {
        return super.parser(string);
    }
}
