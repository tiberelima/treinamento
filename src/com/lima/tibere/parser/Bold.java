package com.lima.tibere.parser;

public class Bold extends AbstractSimpleTagParser {

    public Bold() {
        tag = "b";
        regexp = "[*][*]";
        pattern = "**";
    }

    @Override
    public String parse(String string) {
        return super.parser(string);
    }
}
