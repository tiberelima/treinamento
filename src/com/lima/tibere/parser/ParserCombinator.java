package com.lima.tibere.parser;

import java.util.ArrayList;
import java.util.List;

public class ParserCombinator {

    public List<String> parseCombinado(List<String> from, List<Parser> parsers) {
        List<String> to = new ArrayList<>();
        for (String in : from) {
            for (Parser parser : parsers) {
                in = parser.parse(in);
            }
            to.add(in);
        }
        return to;
    }
}
