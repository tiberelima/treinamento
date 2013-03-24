package com.lima.tibere.parser;

public class Italic extends AbstractSimpleTagParser {

    public Italic() {
        tag = "i";
        regexp = "[/][/]";
        pattern = "//";
    }

    @Override
    public String parse(String string) {
        return super.parser(string);
    }
}
